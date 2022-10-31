import { Injectable } from '@angular/core';
import { Storage,ref, uploadBytes, list, getDownloadURL} from '@angular/fire/storage'
 
@Injectable({
  providedIn: 'root'
})
export class ImagesService {

  URL:string='';

  constructor(private storage:Storage) { }

  uploadImg($event:any,name:string){
    const file=$event.target.files[0];
    const img_ref=ref(this.storage,'img/'+name);
    uploadBytes(img_ref,file)
    .then(resp=>{
      this.getImg();
    })
    .catch(err=>console.log('No se pudo cargar la imagen '+err))
  }

  getImg(){
    const img_ref=ref(this.storage,'img');
    list(img_ref)
    .then(async resp=>{
      for(let item of resp.items)
        this.URL=await getDownloadURL(item)
    })
    .catch(err=>console.log(err))
}
}
