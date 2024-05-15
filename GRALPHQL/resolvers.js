const Post = require("./persona");
const personaModel = require("./persona");

//Resolvers
const resolvers = {
  Query: {
    mostrar: async () => {
      return await personaModel.find();
    },
  },
  Mutation: {
    createPost: async (parent, args, context, info) => {
      const { nombre, apellidos,  pais, edad  } = args.post;
      const post = await new Post({ nombre, apellidos, pais, edad }).save();
      return post;
    },
    updatePost: async (parent, args, context, info) => {
      const { id } = args;
      const { nombre, apellidos,  pais, edad } = args.post;
      const post = await Post.findByIdAndUpdate(
        id,
        {nombre, apellidos,  pais, edad },
        { new: true }
      );
      return post;
    },
    deletePost: async (parent, args, context, info) => {
      const { id } = args;
      await Post.findByIdAndDelete(id);
      return "Deleted";
    },
  },
};
module.exports = resolvers;
