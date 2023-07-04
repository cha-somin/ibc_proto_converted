// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: persistence/interchainquery/v1beta1/genesis.proto
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

struct Persistence_Interchainquery_V1beta1_Query {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: String = String()

  var connectionID: String = String()

  var chainID: String = String()

  var queryType: String = String()

  var request: Data = Data()

  /// change these to uint64 in v0.5.0
  var period: String = String()

  var lastHeight: String = String()

  var callbackID: String = String()

  var ttl: UInt64 = 0

  var lastEmission: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Persistence_Interchainquery_V1beta1_DataPoint {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: String = String()

  /// change these to uint64 in v0.5.0
  var remoteHeight: String = String()

  var localHeight: String = String()

  var value: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// GenesisState defines the epochs module's genesis state.
struct Persistence_Interchainquery_V1beta1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var queries: [Persistence_Interchainquery_V1beta1_Query] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Persistence_Interchainquery_V1beta1_Query: @unchecked Sendable {}
extension Persistence_Interchainquery_V1beta1_DataPoint: @unchecked Sendable {}
extension Persistence_Interchainquery_V1beta1_GenesisState: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "persistence.interchainquery.v1beta1"

extension Persistence_Interchainquery_V1beta1_Query: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Query"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .standard(proto: "connection_id"),
    3: .standard(proto: "chain_id"),
    4: .standard(proto: "query_type"),
    5: .same(proto: "request"),
    6: .same(proto: "period"),
    7: .standard(proto: "last_height"),
    8: .standard(proto: "callback_id"),
    9: .same(proto: "ttl"),
    10: .standard(proto: "last_emission"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.id) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.connectionID) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.chainID) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.queryType) }()
      case 5: try { try decoder.decodeSingularBytesField(value: &self.request) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.period) }()
      case 7: try { try decoder.decodeSingularStringField(value: &self.lastHeight) }()
      case 8: try { try decoder.decodeSingularStringField(value: &self.callbackID) }()
      case 9: try { try decoder.decodeSingularUInt64Field(value: &self.ttl) }()
      case 10: try { try decoder.decodeSingularStringField(value: &self.lastEmission) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.id.isEmpty {
      try visitor.visitSingularStringField(value: self.id, fieldNumber: 1)
    }
    if !self.connectionID.isEmpty {
      try visitor.visitSingularStringField(value: self.connectionID, fieldNumber: 2)
    }
    if !self.chainID.isEmpty {
      try visitor.visitSingularStringField(value: self.chainID, fieldNumber: 3)
    }
    if !self.queryType.isEmpty {
      try visitor.visitSingularStringField(value: self.queryType, fieldNumber: 4)
    }
    if !self.request.isEmpty {
      try visitor.visitSingularBytesField(value: self.request, fieldNumber: 5)
    }
    if !self.period.isEmpty {
      try visitor.visitSingularStringField(value: self.period, fieldNumber: 6)
    }
    if !self.lastHeight.isEmpty {
      try visitor.visitSingularStringField(value: self.lastHeight, fieldNumber: 7)
    }
    if !self.callbackID.isEmpty {
      try visitor.visitSingularStringField(value: self.callbackID, fieldNumber: 8)
    }
    if self.ttl != 0 {
      try visitor.visitSingularUInt64Field(value: self.ttl, fieldNumber: 9)
    }
    if !self.lastEmission.isEmpty {
      try visitor.visitSingularStringField(value: self.lastEmission, fieldNumber: 10)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Persistence_Interchainquery_V1beta1_Query, rhs: Persistence_Interchainquery_V1beta1_Query) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.connectionID != rhs.connectionID {return false}
    if lhs.chainID != rhs.chainID {return false}
    if lhs.queryType != rhs.queryType {return false}
    if lhs.request != rhs.request {return false}
    if lhs.period != rhs.period {return false}
    if lhs.lastHeight != rhs.lastHeight {return false}
    if lhs.callbackID != rhs.callbackID {return false}
    if lhs.ttl != rhs.ttl {return false}
    if lhs.lastEmission != rhs.lastEmission {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Persistence_Interchainquery_V1beta1_DataPoint: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DataPoint"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .standard(proto: "remote_height"),
    3: .standard(proto: "local_height"),
    4: .same(proto: "value"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.id) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.remoteHeight) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.localHeight) }()
      case 4: try { try decoder.decodeSingularBytesField(value: &self.value) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.id.isEmpty {
      try visitor.visitSingularStringField(value: self.id, fieldNumber: 1)
    }
    if !self.remoteHeight.isEmpty {
      try visitor.visitSingularStringField(value: self.remoteHeight, fieldNumber: 2)
    }
    if !self.localHeight.isEmpty {
      try visitor.visitSingularStringField(value: self.localHeight, fieldNumber: 3)
    }
    if !self.value.isEmpty {
      try visitor.visitSingularBytesField(value: self.value, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Persistence_Interchainquery_V1beta1_DataPoint, rhs: Persistence_Interchainquery_V1beta1_DataPoint) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.remoteHeight != rhs.remoteHeight {return false}
    if lhs.localHeight != rhs.localHeight {return false}
    if lhs.value != rhs.value {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Persistence_Interchainquery_V1beta1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "queries"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.queries) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.queries.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.queries, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Persistence_Interchainquery_V1beta1_GenesisState, rhs: Persistence_Interchainquery_V1beta1_GenesisState) -> Bool {
    if lhs.queries != rhs.queries {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}