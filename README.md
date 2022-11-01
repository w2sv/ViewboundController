# __viewboundcontroller__

Small convenience library for the boilerplate-free usage of ViewBindings in Activities and Fragments

![GitHub release (latest by date including pre-releases)](https://img.shields.io/github/v/release/w2sv/viewboundcontroller?include_prereleases)
[![Build](https://github.com/w2sv/viewboundcontroller/actions/workflows/workflow.yaml/badge.svg)](https://github.com/w2sv/viewboundcontroller/actions/workflows/workflow.yaml)
![GitHub](https://img.shields.io/github/license/w2sv/viewboundcontroller)

## Usage

Simply pass the respective `ViewBinding` subclass both as type and constructor argument during the initialization of your UI controller class. The boilerplaty stuff will subsequently be taken care of and you can just use the binding in your code.

The retrieval of the respectively required `inflate` method is carried out by means of reflection. 

### Activity
```kotlin
class YourActivity: ViewBoundActivity<YourActivityBinding>(YourActivityBinding::class.java)
```
`YourActivityBinding` will be inflated in the `onCreate` lifecycle method and is thereupon accessible via the `binding` property

### Fragment

```kotlin
class YourFragment: ViewBoundFragment<YourFragmentBinding>(YourFragmentBinding::class.java)
```
Same goes for Fragments, only that here the binding inflation happens in `onCreateView`. Also, the binding will be nulled in `onDestroyedView` to prevent memory leaks.

## Install

```gradle
implementation 'com.github.w2sv:viewboundcontroller:x.y.z'
```

or get the latest snapshot from the master branch:

```gradle
implementation 'com.github.w2sv:viewboundcontroller:master-SNAPSHOT'
```
