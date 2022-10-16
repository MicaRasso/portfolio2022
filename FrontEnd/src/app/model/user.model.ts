export class user{
    id?:number;
    name:string;
    lastname:string;
    img:string;
    descrip:string;

        constructor(name:string,lastname:string,img:string,descrip:string){
           this.name=name;
           this.lastname=lastname;
           this.img=img;
           this.descrip=descrip;
        }
}