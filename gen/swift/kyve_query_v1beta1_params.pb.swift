// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: kyve/query/v1beta1/params.proto
//
// For information on using the generated types, please see the documentation:
//   https://github.com/apple/swift-protobuf/

import Foundation
import SwiftProtobuf

// If the compiler emits an error on this type, it is because this file
// was generated by a version of the `protoc` Swift plug-in that is
// incompatible with the version of SwiftProtobuf to which you are linking.
// Please ensure that you are building against the same version of the API
// that was used to generate this file.
fileprivate struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
  struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
  typealias Version = _2
}

/// QueryParamsRequest ...
struct Kyve_Query_V1beta1_QueryParamsRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// QueryParamsResponse ...
struct Kyve_Query_V1beta1_QueryParamsResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// bundles_params ...
  var bundlesParams: Kyve_Bundles_V1beta1_Params {
    get {return _storage._bundlesParams ?? Kyve_Bundles_V1beta1_Params()}
    set {_uniqueStorage()._bundlesParams = newValue}
  }
  /// Returns true if `bundlesParams` has been explicitly set.
  var hasBundlesParams: Bool {return _storage._bundlesParams != nil}
  /// Clears the value of `bundlesParams`. Subsequent reads from it will return its default value.
  mutating func clearBundlesParams() {_uniqueStorage()._bundlesParams = nil}

  /// delegation_params ...
  var delegationParams: Kyve_Delegation_V1beta1_Params {
    get {return _storage._delegationParams ?? Kyve_Delegation_V1beta1_Params()}
    set {_uniqueStorage()._delegationParams = newValue}
  }
  /// Returns true if `delegationParams` has been explicitly set.
  var hasDelegationParams: Bool {return _storage._delegationParams != nil}
  /// Clears the value of `delegationParams`. Subsequent reads from it will return its default value.
  mutating func clearDelegationParams() {_uniqueStorage()._delegationParams = nil}

  /// global_params ...
  var globalParams: Kyve_Global_V1beta1_Params {
    get {return _storage._globalParams ?? Kyve_Global_V1beta1_Params()}
    set {_uniqueStorage()._globalParams = newValue}
  }
  /// Returns true if `globalParams` has been explicitly set.
  var hasGlobalParams: Bool {return _storage._globalParams != nil}
  /// Clears the value of `globalParams`. Subsequent reads from it will return its default value.
  mutating func clearGlobalParams() {_uniqueStorage()._globalParams = nil}

  /// gov_params ...
  var govParams: Cosmos_Gov_V1_QueryParamsResponse {
    get {return _storage._govParams ?? Cosmos_Gov_V1_QueryParamsResponse()}
    set {_uniqueStorage()._govParams = newValue}
  }
  /// Returns true if `govParams` has been explicitly set.
  var hasGovParams: Bool {return _storage._govParams != nil}
  /// Clears the value of `govParams`. Subsequent reads from it will return its default value.
  mutating func clearGovParams() {_uniqueStorage()._govParams = nil}

  /// stakers_params ...
  var stakersParams: Kyve_Stakers_V1beta1_Params {
    get {return _storage._stakersParams ?? Kyve_Stakers_V1beta1_Params()}
    set {_uniqueStorage()._stakersParams = newValue}
  }
  /// Returns true if `stakersParams` has been explicitly set.
  var hasStakersParams: Bool {return _storage._stakersParams != nil}
  /// Clears the value of `stakersParams`. Subsequent reads from it will return its default value.
  mutating func clearStakersParams() {_uniqueStorage()._stakersParams = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Kyve_Query_V1beta1_QueryParamsRequest: @unchecked Sendable {}
extension Kyve_Query_V1beta1_QueryParamsResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "kyve.query.v1beta1"

extension Kyve_Query_V1beta1_QueryParamsRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryParamsRequest"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Query_V1beta1_QueryParamsRequest, rhs: Kyve_Query_V1beta1_QueryParamsRequest) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Query_V1beta1_QueryParamsResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryParamsResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "bundles_params"),
    2: .standard(proto: "delegation_params"),
    3: .standard(proto: "global_params"),
    4: .standard(proto: "gov_params"),
    5: .standard(proto: "stakers_params"),
  ]

  fileprivate class _StorageClass {
    var _bundlesParams: Kyve_Bundles_V1beta1_Params? = nil
    var _delegationParams: Kyve_Delegation_V1beta1_Params? = nil
    var _globalParams: Kyve_Global_V1beta1_Params? = nil
    var _govParams: Cosmos_Gov_V1_QueryParamsResponse? = nil
    var _stakersParams: Kyve_Stakers_V1beta1_Params? = nil

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _bundlesParams = source._bundlesParams
      _delegationParams = source._delegationParams
      _globalParams = source._globalParams
      _govParams = source._govParams
      _stakersParams = source._stakersParams
    }
  }

  fileprivate mutating func _uniqueStorage() -> _StorageClass {
    if !isKnownUniquelyReferenced(&_storage) {
      _storage = _StorageClass(copying: _storage)
    }
    return _storage
  }

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    _ = _uniqueStorage()
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      while let fieldNumber = try decoder.nextFieldNumber() {
        // The use of inline closures is to circumvent an issue where the compiler
        // allocates stack space for every case branch when no optimizations are
        // enabled. https://github.com/apple/swift-protobuf/issues/1034
        switch fieldNumber {
        case 1: try { try decoder.decodeSingularMessageField(value: &_storage._bundlesParams) }()
        case 2: try { try decoder.decodeSingularMessageField(value: &_storage._delegationParams) }()
        case 3: try { try decoder.decodeSingularMessageField(value: &_storage._globalParams) }()
        case 4: try { try decoder.decodeSingularMessageField(value: &_storage._govParams) }()
        case 5: try { try decoder.decodeSingularMessageField(value: &_storage._stakersParams) }()
        default: break
        }
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every if/case branch local when no optimizations
      // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
      // https://github.com/apple/swift-protobuf/issues/1182
      try { if let v = _storage._bundlesParams {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
      } }()
      try { if let v = _storage._delegationParams {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
      } }()
      try { if let v = _storage._globalParams {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
      } }()
      try { if let v = _storage._govParams {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
      } }()
      try { if let v = _storage._stakersParams {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
      } }()
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Query_V1beta1_QueryParamsResponse, rhs: Kyve_Query_V1beta1_QueryParamsResponse) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._bundlesParams != rhs_storage._bundlesParams {return false}
        if _storage._delegationParams != rhs_storage._delegationParams {return false}
        if _storage._globalParams != rhs_storage._globalParams {return false}
        if _storage._govParams != rhs_storage._govParams {return false}
        if _storage._stakersParams != rhs_storage._stakersParams {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
