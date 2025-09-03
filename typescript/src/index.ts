import { newRenderer } from "./renderer"
import { Shape } from "./shapes/shape"
import { Rectangle } from "./shapes/rectangle"

const rectangle: Shape = new Rectangle(2, 3)
const renderer = newRenderer(rectangle)
renderer.draw();