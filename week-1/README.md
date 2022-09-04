
## Namespace nedir?

Aynı isimde etiketlere sahip olan XML kaynaklarının çakışabilirler. Bu çakışmaların önüne geçmek için namespace veya prefix kullanılmalıdır. 
Bir namespace tanımlanırken genellikle URL veya URN verilir. Böyle yaparak bu namespace'nin benzersiz olması sağlanır çünkü aynısından iki tane olamaz.
  

## Örnekler

## Kullanım/Örnekler

```xml
<persons xmlns="http://www.godoro.com/test">
	<person no="122">
		<name>Albert</name>
		<surname>Einstein</surname>
		<address xmlns="http://www.godoro.com/profile">
			<city>istanbul</city>
			<country>Turkiye</country>
		</address>
	</person>
	<person no="122">
		<name>Orhan</name>
		<surname>Gencebay</surname>
		<address xmlns="http://www.godoro.com/profile">
			<city>Ankara</city>
			<country>Turkiye</country>
		</address>
	</person>
</persons>

```

  