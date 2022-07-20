/**
 * 
 */

/* DOM */
document.getElementById('header1').innerHTML = "<p>Hellow world</p>"
document.getElementById('dom1').innerHTML = "<table border='1'><tr><td>Kolom 1 Baris 1</td><td>Kolom 2 Baris 1</td></tr><tr><td>Kolom 1 Baris 2</td><td>Kolom 2 Baris 2</td></tr></table>"
let a1 = 9
let a2 = '9'
document.write('<br> Operator == ')
document.write(a1==a2)
document.write('<br> Operator === ')
document.write(a1===a2)
/* END DOM */

var data = 900
data = 9
var data = "halo"
console.log("var dtype : " + data)

let data1 = 8900;
let data2 = 80;

/* const data3 = 700;
data3 = 70; */

function alertFunc() {
	alert("Halo bro!!")
	
}

function biodata(name, age, address) {
	console.log(name + ' ' + age + ' ' + address)
}

biodata('jijo', 24, 'Bandung')

function numb() {
	return 5
}

function logic1(a) {
	return a * numb()
}

function sliceFunc(){
	var buah = ["mangga","jeruk","apel"]
	console.log('baca slice 1'+buah.slice(1))
	buah.push('semangka', 'durian')
	console.log('baca slice 2'+buah.slice(1, 5))
	console.log(buah)	
}

function spliceFunc(){
	var buah = ["mangga","jeruk","apel"]
	buah.push('semangka', 'durian')
	console.log('baca splice 1'+buah.splice(1,2, 'manggis', 'pisang', 'rambutan','anggur'))
	console.log('baca slice 2'+buah.slice(1, 5))
	console.log(buah)	
}

function filterArr(){
	var buah = ["mangga","jeruk","apel"]
	buah.push('semangka', 'durian', 'mangga','mangga', 1, )
	var dataFil = 'mangga'
	
	console.log(buah.filter(item =>
			dataFil.includes(item))
			)
}

function forEachFunc(){
	var angka = [1, 44, 22, 6]
	
	angka.forEach(item=>{
		console.log(item * item)
	})
}

function objLiteral(){
	var biodata1={
		name : "Robert",
		class : "12A",
		age : 17
	}
	
	console.log('for in')
	for(item in biodata1){
		console.log(biodata1[item])
	}
	
	console.log('for entries')
	Object.values(biodata1).forEach(item => {
		console.log(item)
	})
}

function toko(produk, jumlah, harga){
	var pembeli = {}
	pembeli.produk = produk;
	pembeli.jumlah = jumlah;
	pembeli.harga = harga;
	return pembeli;
}

var pembeli1 = toko('susu', 10, 5500)

function tokoSebelah(produk, jumlah, harga){
	this.produk = produk,
	this.jumlah = jumlah,
	this.harga = harga
}

var pembeli2 = new tokoSebelah('permen', 100, 200)

/*obj prototype*/
function tokoBangunan(produk, jumlah, harga){
	this.produk = produk,
	this.jumlah = jumlah,
	this.harga = harga
}


tokoBangunan.prototype.stok = function(jumlah){
	var result =jumlah * this.harga
	return 'total sisa stok = '+jumlah+', total harga = '+result
}
var pembeli3 = new tokoBangunan('permen', 100, 200)
var supervisor = new tokoBangunan('permen', 100, 200)