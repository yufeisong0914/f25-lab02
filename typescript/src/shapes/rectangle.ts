import { Shape } from './shape'

class Rectangle implements Shape {
    constructor(
        private width: number,
        private height: number
    ) {}

    computeArea(): number {
        return this.width * this.height
    }
}

export { Rectangle }
