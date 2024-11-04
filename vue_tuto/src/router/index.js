import { createMemoryHistory, createRouter } from "vue-router";

import PostsView from "@/pages/PostsView";
import News from "@/pages/PostNews";
import About from "@/components/PostAbout";

const routes = [
  { path: "/", component: PostsView },
  { path: "/news", component: News },
  { path: "/about", component: About },
];

const router = createRouter({
  history: createMemoryHistory(),
  routes,
});

export default router;
