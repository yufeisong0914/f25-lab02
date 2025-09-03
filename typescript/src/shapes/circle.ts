import { Shape } from './shape'

class Circle implements Shape {
    constructor (
        private radius: number
    ) {}

    computeArea(): number {
        return Math.PI * this.radius * this.radius;
    }
}

export { Circle }