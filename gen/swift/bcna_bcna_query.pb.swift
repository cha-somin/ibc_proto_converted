// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: bcna/bcna/query.proto
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

/// QueryParamsRequest is request type for the Query/Params RPC method.
struct Bitcannaglobal_Bcna_Bcna_QueryParamsRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// QueryParamsResponse is response type for the Query/Params RPC method.
struct Bitcannaglobal_Bcna_Bcna_QueryParamsResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// params holds all the parameters of this module.
  var params: Bitcannaglobal_Bcna_Bcna_Params {
    get {return _params ?? Bitcannaglobal_Bcna_Bcna_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Bitcannaglobal_Bcna_Bcna_Params? = nil
}

struct Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var bcnaid: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var bitcannaid: Bitcannaglobal_Bcna_Bcna_Bitcannaid {
    get {return _bitcannaid ?? Bitcannaglobal_Bcna_Bcna_Bitcannaid()}
    set {_bitcannaid = newValue}
  }
  /// Returns true if `bitcannaid` has been explicitly set.
  var hasBitcannaid: Bool {return self._bitcannaid != nil}
  /// Clears the value of `bitcannaid`. Subsequent reads from it will return its default value.
  mutating func clearBitcannaid() {self._bitcannaid = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _bitcannaid: Bitcannaglobal_Bcna_Bcna_Bitcannaid? = nil
}

struct Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var bitcannaid: Bitcannaglobal_Bcna_Bcna_Bitcannaid {
    get {return _bitcannaid ?? Bitcannaglobal_Bcna_Bcna_Bitcannaid()}
    set {_bitcannaid = newValue}
  }
  /// Returns true if `bitcannaid` has been explicitly set.
  var hasBitcannaid: Bool {return self._bitcannaid != nil}
  /// Clears the value of `bitcannaid`. Subsequent reads from it will return its default value.
  mutating func clearBitcannaid() {self._bitcannaid = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _bitcannaid: Bitcannaglobal_Bcna_Bcna_Bitcannaid? = nil
}

struct Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var pagination: Cosmos_Base_Query_V1beta1_PageRequest {
    get {return _pagination ?? Cosmos_Base_Query_V1beta1_PageRequest()}
    set {_pagination = newValue}
  }
  /// Returns true if `pagination` has been explicitly set.
  var hasPagination: Bool {return self._pagination != nil}
  /// Clears the value of `pagination`. Subsequent reads from it will return its default value.
  mutating func clearPagination() {self._pagination = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _pagination: Cosmos_Base_Query_V1beta1_PageRequest? = nil
}

struct Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var bitcannaid: [Bitcannaglobal_Bcna_Bcna_Bitcannaid] = []

  var pagination: Cosmos_Base_Query_V1beta1_PageResponse {
    get {return _pagination ?? Cosmos_Base_Query_V1beta1_PageResponse()}
    set {_pagination = newValue}
  }
  /// Returns true if `pagination` has been explicitly set.
  var hasPagination: Bool {return self._pagination != nil}
  /// Clears the value of `pagination`. Subsequent reads from it will return its default value.
  mutating func clearPagination() {self._pagination = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _pagination: Cosmos_Base_Query_V1beta1_PageResponse? = nil
}

struct Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var supplychain: Bitcannaglobal_Bcna_Bcna_Supplychain {
    get {return _supplychain ?? Bitcannaglobal_Bcna_Bcna_Supplychain()}
    set {_supplychain = newValue}
  }
  /// Returns true if `supplychain` has been explicitly set.
  var hasSupplychain: Bool {return self._supplychain != nil}
  /// Clears the value of `supplychain`. Subsequent reads from it will return its default value.
  mutating func clearSupplychain() {self._supplychain = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _supplychain: Bitcannaglobal_Bcna_Bcna_Supplychain? = nil
}

struct Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var pagination: Cosmos_Base_Query_V1beta1_PageRequest {
    get {return _pagination ?? Cosmos_Base_Query_V1beta1_PageRequest()}
    set {_pagination = newValue}
  }
  /// Returns true if `pagination` has been explicitly set.
  var hasPagination: Bool {return self._pagination != nil}
  /// Clears the value of `pagination`. Subsequent reads from it will return its default value.
  mutating func clearPagination() {self._pagination = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _pagination: Cosmos_Base_Query_V1beta1_PageRequest? = nil
}

struct Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var supplychain: [Bitcannaglobal_Bcna_Bcna_Supplychain] = []

  var pagination: Cosmos_Base_Query_V1beta1_PageResponse {
    get {return _pagination ?? Cosmos_Base_Query_V1beta1_PageResponse()}
    set {_pagination = newValue}
  }
  /// Returns true if `pagination` has been explicitly set.
  var hasPagination: Bool {return self._pagination != nil}
  /// Clears the value of `pagination`. Subsequent reads from it will return its default value.
  mutating func clearPagination() {self._pagination = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _pagination: Cosmos_Base_Query_V1beta1_PageResponse? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Bitcannaglobal_Bcna_Bcna_QueryParamsRequest: @unchecked Sendable {}
extension Bitcannaglobal_Bcna_Bcna_QueryParamsResponse: @unchecked Sendable {}
extension Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidRequest: @unchecked Sendable {}
extension Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidResponse: @unchecked Sendable {}
extension Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidRequest: @unchecked Sendable {}
extension Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidResponse: @unchecked Sendable {}
extension Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidRequest: @unchecked Sendable {}
extension Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidResponse: @unchecked Sendable {}
extension Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainRequest: @unchecked Sendable {}
extension Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainResponse: @unchecked Sendable {}
extension Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainRequest: @unchecked Sendable {}
extension Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "bitcannaglobal.bcna.bcna"

extension Bitcannaglobal_Bcna_Bcna_QueryParamsRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryParamsRequest"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitcannaglobal_Bcna_Bcna_QueryParamsRequest, rhs: Bitcannaglobal_Bcna_Bcna_QueryParamsRequest) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitcannaglobal_Bcna_Bcna_QueryParamsResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryParamsResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "params"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._params {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitcannaglobal_Bcna_Bcna_QueryParamsResponse, rhs: Bitcannaglobal_Bcna_Bcna_QueryParamsResponse) -> Bool {
    if lhs._params != rhs._params {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryGetBitcannaidByBcnaidRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "bcnaid"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.bcnaid) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.bcnaid.isEmpty {
      try visitor.visitSingularStringField(value: self.bcnaid, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidRequest, rhs: Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidRequest) -> Bool {
    if lhs.bcnaid != rhs.bcnaid {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryGetBitcannaidByBcnaidResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "Bitcannaid"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._bitcannaid) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._bitcannaid {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidResponse, rhs: Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidByBcnaidResponse) -> Bool {
    if lhs._bitcannaid != rhs._bitcannaid {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryGetBitcannaidRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidRequest, rhs: Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidRequest) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryGetBitcannaidResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "Bitcannaid"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._bitcannaid) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._bitcannaid {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidResponse, rhs: Bitcannaglobal_Bcna_Bcna_QueryGetBitcannaidResponse) -> Bool {
    if lhs._bitcannaid != rhs._bitcannaid {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryAllBitcannaidRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "pagination"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._pagination) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._pagination {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidRequest, rhs: Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidRequest) -> Bool {
    if lhs._pagination != rhs._pagination {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryAllBitcannaidResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "Bitcannaid"),
    2: .same(proto: "pagination"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.bitcannaid) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._pagination) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.bitcannaid.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.bitcannaid, fieldNumber: 1)
    }
    try { if let v = self._pagination {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidResponse, rhs: Bitcannaglobal_Bcna_Bcna_QueryAllBitcannaidResponse) -> Bool {
    if lhs.bitcannaid != rhs.bitcannaid {return false}
    if lhs._pagination != rhs._pagination {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryGetSupplychainRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainRequest, rhs: Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainRequest) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryGetSupplychainResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "Supplychain"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._supplychain) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._supplychain {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainResponse, rhs: Bitcannaglobal_Bcna_Bcna_QueryGetSupplychainResponse) -> Bool {
    if lhs._supplychain != rhs._supplychain {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryAllSupplychainRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "pagination"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._pagination) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._pagination {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainRequest, rhs: Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainRequest) -> Bool {
    if lhs._pagination != rhs._pagination {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryAllSupplychainResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "Supplychain"),
    2: .same(proto: "pagination"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.supplychain) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._pagination) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.supplychain.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.supplychain, fieldNumber: 1)
    }
    try { if let v = self._pagination {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainResponse, rhs: Bitcannaglobal_Bcna_Bcna_QueryAllSupplychainResponse) -> Bool {
    if lhs.supplychain != rhs.supplychain {return false}
    if lhs._pagination != rhs._pagination {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}