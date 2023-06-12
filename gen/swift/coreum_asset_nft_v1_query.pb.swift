// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: coreum/asset/nft/v1/query.proto
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

/// QueryParamsRequest defines the request type for querying x/asset/nft parameters.
struct Coreum_Asset_Nft_V1_QueryParamsRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// QueryParamsResponse defines the response type for querying x/asset/nft parameters.
struct Coreum_Asset_Nft_V1_QueryParamsResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var params: Coreum_Asset_Nft_V1_Params {
    get {return _params ?? Coreum_Asset_Nft_V1_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Coreum_Asset_Nft_V1_Params? = nil
}

/// QueryTokenRequest is request type for the Query/Class RPC method.
struct Coreum_Asset_Nft_V1_QueryClassRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// we don't use the gogoproto.customname here since the google.api.http ignores it and generates invalid code.
  var id: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// QueryClassResponse is response type for the Query/Class RPC method.
struct Coreum_Asset_Nft_V1_QueryClassResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var `class`: Coreum_Asset_Nft_V1_Class {
    get {return _class ?? Coreum_Asset_Nft_V1_Class()}
    set {_class = newValue}
  }
  /// Returns true if ``class`` has been explicitly set.
  var hasClass: Bool {return self._class != nil}
  /// Clears the value of ``class``. Subsequent reads from it will return its default value.
  mutating func clearClass() {self._class = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _class: Coreum_Asset_Nft_V1_Class? = nil
}

/// QueryTokenRequest is request type for the Query/Classes RPC method.
struct Coreum_Asset_Nft_V1_QueryClassesRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// pagination defines an optional pagination for the request.
  var pagination: Cosmos_Base_Query_V1beta1_PageRequest {
    get {return _pagination ?? Cosmos_Base_Query_V1beta1_PageRequest()}
    set {_pagination = newValue}
  }
  /// Returns true if `pagination` has been explicitly set.
  var hasPagination: Bool {return self._pagination != nil}
  /// Clears the value of `pagination`. Subsequent reads from it will return its default value.
  mutating func clearPagination() {self._pagination = nil}

  var issuer: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _pagination: Cosmos_Base_Query_V1beta1_PageRequest? = nil
}

/// QueryClassResponse is response type for the Query/Classes RPC method.
struct Coreum_Asset_Nft_V1_QueryClassesResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// pagination defines the pagination in the response.
  var pagination: Cosmos_Base_Query_V1beta1_PageResponse {
    get {return _pagination ?? Cosmos_Base_Query_V1beta1_PageResponse()}
    set {_pagination = newValue}
  }
  /// Returns true if `pagination` has been explicitly set.
  var hasPagination: Bool {return self._pagination != nil}
  /// Clears the value of `pagination`. Subsequent reads from it will return its default value.
  mutating func clearPagination() {self._pagination = nil}

  var classes: [Coreum_Asset_Nft_V1_Class] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _pagination: Cosmos_Base_Query_V1beta1_PageResponse? = nil
}

struct Coreum_Asset_Nft_V1_QueryFrozenRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: String = String()

  var classID: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Coreum_Asset_Nft_V1_QueryFrozenResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var frozen: Bool = false

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Coreum_Asset_Nft_V1_QueryWhitelistedRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: String = String()

  var classID: String = String()

  var account: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Coreum_Asset_Nft_V1_QueryWhitelistedResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var whitelisted: Bool = false

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Coreum_Asset_Nft_V1_QueryWhitelistedAccountsForNFTRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// pagination defines an optional pagination for the request.
  var pagination: Cosmos_Base_Query_V1beta1_PageRequest {
    get {return _pagination ?? Cosmos_Base_Query_V1beta1_PageRequest()}
    set {_pagination = newValue}
  }
  /// Returns true if `pagination` has been explicitly set.
  var hasPagination: Bool {return self._pagination != nil}
  /// Clears the value of `pagination`. Subsequent reads from it will return its default value.
  mutating func clearPagination() {self._pagination = nil}

  var id: String = String()

  var classID: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _pagination: Cosmos_Base_Query_V1beta1_PageRequest? = nil
}

struct Coreum_Asset_Nft_V1_QueryWhitelistedAccountsForNFTResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// pagination defines the pagination in the response.
  var pagination: Cosmos_Base_Query_V1beta1_PageResponse {
    get {return _pagination ?? Cosmos_Base_Query_V1beta1_PageResponse()}
    set {_pagination = newValue}
  }
  /// Returns true if `pagination` has been explicitly set.
  var hasPagination: Bool {return self._pagination != nil}
  /// Clears the value of `pagination`. Subsequent reads from it will return its default value.
  mutating func clearPagination() {self._pagination = nil}

  var accounts: [String] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _pagination: Cosmos_Base_Query_V1beta1_PageResponse? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Coreum_Asset_Nft_V1_QueryParamsRequest: @unchecked Sendable {}
extension Coreum_Asset_Nft_V1_QueryParamsResponse: @unchecked Sendable {}
extension Coreum_Asset_Nft_V1_QueryClassRequest: @unchecked Sendable {}
extension Coreum_Asset_Nft_V1_QueryClassResponse: @unchecked Sendable {}
extension Coreum_Asset_Nft_V1_QueryClassesRequest: @unchecked Sendable {}
extension Coreum_Asset_Nft_V1_QueryClassesResponse: @unchecked Sendable {}
extension Coreum_Asset_Nft_V1_QueryFrozenRequest: @unchecked Sendable {}
extension Coreum_Asset_Nft_V1_QueryFrozenResponse: @unchecked Sendable {}
extension Coreum_Asset_Nft_V1_QueryWhitelistedRequest: @unchecked Sendable {}
extension Coreum_Asset_Nft_V1_QueryWhitelistedResponse: @unchecked Sendable {}
extension Coreum_Asset_Nft_V1_QueryWhitelistedAccountsForNFTRequest: @unchecked Sendable {}
extension Coreum_Asset_Nft_V1_QueryWhitelistedAccountsForNFTResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "coreum.asset.nft.v1"

extension Coreum_Asset_Nft_V1_QueryParamsRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryParamsRequest"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Coreum_Asset_Nft_V1_QueryParamsRequest, rhs: Coreum_Asset_Nft_V1_QueryParamsRequest) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Coreum_Asset_Nft_V1_QueryParamsResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
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

  static func ==(lhs: Coreum_Asset_Nft_V1_QueryParamsResponse, rhs: Coreum_Asset_Nft_V1_QueryParamsResponse) -> Bool {
    if lhs._params != rhs._params {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Coreum_Asset_Nft_V1_QueryClassRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryClassRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.id) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.id.isEmpty {
      try visitor.visitSingularStringField(value: self.id, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Coreum_Asset_Nft_V1_QueryClassRequest, rhs: Coreum_Asset_Nft_V1_QueryClassRequest) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Coreum_Asset_Nft_V1_QueryClassResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryClassResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "class"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._class) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._class {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Coreum_Asset_Nft_V1_QueryClassResponse, rhs: Coreum_Asset_Nft_V1_QueryClassResponse) -> Bool {
    if lhs._class != rhs._class {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Coreum_Asset_Nft_V1_QueryClassesRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryClassesRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "pagination"),
    2: .same(proto: "issuer"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._pagination) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.issuer) }()
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
    if !self.issuer.isEmpty {
      try visitor.visitSingularStringField(value: self.issuer, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Coreum_Asset_Nft_V1_QueryClassesRequest, rhs: Coreum_Asset_Nft_V1_QueryClassesRequest) -> Bool {
    if lhs._pagination != rhs._pagination {return false}
    if lhs.issuer != rhs.issuer {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Coreum_Asset_Nft_V1_QueryClassesResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryClassesResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "pagination"),
    2: .same(proto: "classes"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._pagination) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.classes) }()
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
    if !self.classes.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.classes, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Coreum_Asset_Nft_V1_QueryClassesResponse, rhs: Coreum_Asset_Nft_V1_QueryClassesResponse) -> Bool {
    if lhs._pagination != rhs._pagination {return false}
    if lhs.classes != rhs.classes {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Coreum_Asset_Nft_V1_QueryFrozenRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryFrozenRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .standard(proto: "class_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.id) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.classID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.id.isEmpty {
      try visitor.visitSingularStringField(value: self.id, fieldNumber: 1)
    }
    if !self.classID.isEmpty {
      try visitor.visitSingularStringField(value: self.classID, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Coreum_Asset_Nft_V1_QueryFrozenRequest, rhs: Coreum_Asset_Nft_V1_QueryFrozenRequest) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.classID != rhs.classID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Coreum_Asset_Nft_V1_QueryFrozenResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryFrozenResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "frozen"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBoolField(value: &self.frozen) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.frozen != false {
      try visitor.visitSingularBoolField(value: self.frozen, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Coreum_Asset_Nft_V1_QueryFrozenResponse, rhs: Coreum_Asset_Nft_V1_QueryFrozenResponse) -> Bool {
    if lhs.frozen != rhs.frozen {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Coreum_Asset_Nft_V1_QueryWhitelistedRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryWhitelistedRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .standard(proto: "class_id"),
    3: .same(proto: "account"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.id) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.classID) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.account) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.id.isEmpty {
      try visitor.visitSingularStringField(value: self.id, fieldNumber: 1)
    }
    if !self.classID.isEmpty {
      try visitor.visitSingularStringField(value: self.classID, fieldNumber: 2)
    }
    if !self.account.isEmpty {
      try visitor.visitSingularStringField(value: self.account, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Coreum_Asset_Nft_V1_QueryWhitelistedRequest, rhs: Coreum_Asset_Nft_V1_QueryWhitelistedRequest) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.classID != rhs.classID {return false}
    if lhs.account != rhs.account {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Coreum_Asset_Nft_V1_QueryWhitelistedResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryWhitelistedResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "whitelisted"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBoolField(value: &self.whitelisted) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.whitelisted != false {
      try visitor.visitSingularBoolField(value: self.whitelisted, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Coreum_Asset_Nft_V1_QueryWhitelistedResponse, rhs: Coreum_Asset_Nft_V1_QueryWhitelistedResponse) -> Bool {
    if lhs.whitelisted != rhs.whitelisted {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Coreum_Asset_Nft_V1_QueryWhitelistedAccountsForNFTRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryWhitelistedAccountsForNFTRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "pagination"),
    2: .same(proto: "id"),
    3: .standard(proto: "class_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._pagination) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.id) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.classID) }()
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
    if !self.id.isEmpty {
      try visitor.visitSingularStringField(value: self.id, fieldNumber: 2)
    }
    if !self.classID.isEmpty {
      try visitor.visitSingularStringField(value: self.classID, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Coreum_Asset_Nft_V1_QueryWhitelistedAccountsForNFTRequest, rhs: Coreum_Asset_Nft_V1_QueryWhitelistedAccountsForNFTRequest) -> Bool {
    if lhs._pagination != rhs._pagination {return false}
    if lhs.id != rhs.id {return false}
    if lhs.classID != rhs.classID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Coreum_Asset_Nft_V1_QueryWhitelistedAccountsForNFTResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryWhitelistedAccountsForNFTResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "pagination"),
    2: .same(proto: "accounts"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._pagination) }()
      case 2: try { try decoder.decodeRepeatedStringField(value: &self.accounts) }()
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
    if !self.accounts.isEmpty {
      try visitor.visitRepeatedStringField(value: self.accounts, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Coreum_Asset_Nft_V1_QueryWhitelistedAccountsForNFTResponse, rhs: Coreum_Asset_Nft_V1_QueryWhitelistedAccountsForNFTResponse) -> Bool {
    if lhs._pagination != rhs._pagination {return false}
    if lhs.accounts != rhs.accounts {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
