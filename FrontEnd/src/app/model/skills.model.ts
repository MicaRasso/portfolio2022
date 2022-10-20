export class skills{
    id?:number;
    name:string;
    percentage:number;
    hard:boolean;
    
        constructor(name:string,percentage:number,hard:boolean){
           this.name=name;
           this.percentage=percentage;
           this.hard=hard;
        }
}