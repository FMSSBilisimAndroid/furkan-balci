## Açıklama
### onSaveInstanceState nedir?
Kaybolmamasını istediğimiz verileri bu kısımda set ediyoruz ve bundle (bohça) içine yerleştiriyoruz. 
```kotlin
override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        //Get textView message.
        val textViewMessage = binding.textView.text.toString()

        //Save textview message in bundle.
        outState.putString(Key.NAME, textViewMessage)

    }
```

### onViewStateRestored nedir?
Kaybolmamasını istediğimiz verileri bu kısımda bundle içerisinden çekip yerleştirmek istediğimiz bölümlere (editText, textView, imageView, vs.) yerleştiriyoruz.
```kotlin
override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        //If saved instance is not null
        savedInstanceState?.let {

            //Get bundle content.
            val content = it.getString(Key.NAME, "a")

            //Set textview.
            binding.textView.text = content
        }
    }
```

## Kullanılanlar
- ViewBinding
- Constants
- Fragments

## Resimler
- ![](https://i.gyazo.com/2ab14981df4b2537ae94db7894226ce3.gif)
