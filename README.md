# ViewboundController

![GitHub release (latest by date including pre-releases)](https://img.shields.io/github/v/release/w2sv/ViewboundController?include_prereleases)
[![](https://jitpack.io/v/w2sv/ViewboundController.svg)](https://jitpack.io/#w2sv/ViewboundController)
[![Build](https://github.com/w2sv/Viewboundcontroller/actions/workflows/workflow.yaml/badge.svg)](https://github.com/w2sv/ViewboundController/actions/workflows/workflow.yaml)
![GitHub](https://img.shields.io/github/license/w2sv/ViewboundController)

Small Android library for the usage of ViewBindings in your Activities and Fragments without the usual boilerplate code

## Usage

Simply pass the respective `ViewBinding` subclass both as type and constructor argument during the initialization of your UI controller class. The boilerplaty stuff will subsequently be taken care of and you can just use the binding in your code.

The retrieval of the respectively required `inflate` method is carried out by means of reflection. 

- Activity
  ```kotlin
  class YourActivity: ViewBoundActivity<YourActivityBinding>(YourActivityBinding::class.java)
  ```
  `YourActivityBinding` will be inflated in the `onCreate` lifecycle method and is thereupon accessible via the `binding` property

- Fragment

  ```kotlin
  class YourFragment: ViewBoundFragment<YourFragmentBinding>(YourFragmentBinding::class.java)
  ```
  Same goes for Fragments, only that here the binding inflation happens in `onCreateView`. Also, the binding will be nulled in `onDestroyedView` to prevent memory leaks.

## Installation with gradle & jitpack

```gradle
implementation 'com.github.w2sv:viewboundcontroller:x.y.z'
```

or get the latest snapshot from a certain branch:

```gradle
implementation 'com.github.w2sv:viewboundcontroller:<BRANCH-NAME>-SNAPSHOT'
```

## License

[GPL-3.0](https://github.com/w2sv/ViewboundController/blob/main/LICENSE)
