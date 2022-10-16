export class aboutme{
    id?:number;
    name:string;
    lastname:string;
    title:string;
    birthday:string;
    img_profile:string;
    img_banner:string;
    description:string;

    constructor(name:string,lastname:string,title:string,birthday:string,img_profile:string,img_banner:string,descrip:string){
        this.name=name;
        this.lastname=lastname;
        this.title=title;
        this.birthday=birthday;
        this.img_profile=img_profile;
        this.img_banner=img_banner;
        this.description=descrip;
    }
}