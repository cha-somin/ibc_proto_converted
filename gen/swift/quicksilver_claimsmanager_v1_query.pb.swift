// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: quicksilver/claimsmanager/v1/query.proto
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

/// QueryClaimsRequest is the request type for the Query/Claims RPC method.
struct Quicksilver_Claimsmanager_V1_QueryClaimsRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var chainID: String = String()

  var address: String = String()

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

/// QueryClaimsResponse is the response type for the Query/Claims RPC method.
struct Quicksilver_Claimsmanager_V1_QueryClaimsResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var claims: [Quicksilver_Claimsmanager_V1_Claim] = []

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
extension Quicksilver_Claimsmanager_V1_QueryClaimsRequest: @unchecked Sendable {}
extension Quicksilver_Claimsmanager_V1_QueryClaimsResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "quicksilver.claimsmanager.v1"

extension Quicksilver_Claimsmanager_V1_QueryClaimsRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryClaimsRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "chain_id"),
    2: .same(proto: "address"),
    3: .same(proto: "pagination"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.chainID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.address) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._pagination) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.chainID.isEmpty {
      try visitor.visitSingularStringField(value: self.chainID, fieldNumber: 1)
    }
    if !self.address.isEmpty {
      try visitor.visitSingularStringField(value: self.address, fieldNumber: 2)
    }
    try { if let v = self._pagination {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Quicksilver_Claimsmanager_V1_QueryClaimsRequest, rhs: Quicksilver_Claimsmanager_V1_QueryClaimsRequest) -> Bool {
    if lhs.chainID != rhs.chainID {return false}
    if lhs.address != rhs.address {return false}
    if lhs._pagination != rhs._pagination {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Quicksilver_Claimsmanager_V1_QueryClaimsResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryClaimsResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "claims"),
    2: .same(proto: "pagination"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.claims) }()
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
    if !self.claims.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.claims, fieldNumber: 1)
    }
    try { if let v = self._pagination {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Quicksilver_Claimsmanager_V1_QueryClaimsResponse, rhs: Quicksilver_Claimsmanager_V1_QueryClaimsResponse) -> Bool {
    if lhs.claims != rhs.claims {return false}
    if lhs._pagination != rhs._pagination {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
