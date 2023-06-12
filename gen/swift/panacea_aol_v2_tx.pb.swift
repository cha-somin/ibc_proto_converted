// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: panacea/aol/v2/tx.proto
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

/// MsgCreateTopic defines the Msg/CreateTopic request type.
struct Panacea_Aol_V2_MsgCreateTopic {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var topicName: String = String()

  var description_p: String = String()

  var ownerAddress: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgCreateTopicResponse defines the Msg/CreateTopic response type.
struct Panacea_Aol_V2_MsgCreateTopicResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgAddWriter defines the Msg/AddWriter request type.
struct Panacea_Aol_V2_MsgAddWriter {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var topicName: String = String()

  var moniker: String = String()

  var description_p: String = String()

  var writerAddress: String = String()

  var ownerAddress: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgAddWriter defines the Msg/AddWriter response type.
struct Panacea_Aol_V2_MsgAddWriterResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgDeleteWriter defines the Msg/DeleteWriter request type.
struct Panacea_Aol_V2_MsgDeleteWriter {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var topicName: String = String()

  var writerAddress: String = String()

  var ownerAddress: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgDeleteWriter defines the Msg/DeleteWriter response type.
struct Panacea_Aol_V2_MsgDeleteWriterResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgAddRecord defines the Msg/AddRecord request type.
struct Panacea_Aol_V2_MsgAddRecord {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var topicName: String = String()

  var key: Data = Data()

  var value: Data = Data()

  var writerAddress: String = String()

  var ownerAddress: String = String()

  var feePayerAddress: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgAddRecordResponse defines the Msg/AddRecordResponse response type.
struct Panacea_Aol_V2_MsgAddRecordResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var ownerAddress: String = String()

  var topicName: String = String()

  var offset: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Panacea_Aol_V2_MsgCreateTopic: @unchecked Sendable {}
extension Panacea_Aol_V2_MsgCreateTopicResponse: @unchecked Sendable {}
extension Panacea_Aol_V2_MsgAddWriter: @unchecked Sendable {}
extension Panacea_Aol_V2_MsgAddWriterResponse: @unchecked Sendable {}
extension Panacea_Aol_V2_MsgDeleteWriter: @unchecked Sendable {}
extension Panacea_Aol_V2_MsgDeleteWriterResponse: @unchecked Sendable {}
extension Panacea_Aol_V2_MsgAddRecord: @unchecked Sendable {}
extension Panacea_Aol_V2_MsgAddRecordResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "panacea.aol.v2"

extension Panacea_Aol_V2_MsgCreateTopic: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCreateTopic"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "topic_name"),
    2: .same(proto: "description"),
    3: .standard(proto: "owner_address"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.topicName) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.ownerAddress) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.topicName.isEmpty {
      try visitor.visitSingularStringField(value: self.topicName, fieldNumber: 1)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 2)
    }
    if !self.ownerAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.ownerAddress, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Aol_V2_MsgCreateTopic, rhs: Panacea_Aol_V2_MsgCreateTopic) -> Bool {
    if lhs.topicName != rhs.topicName {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.ownerAddress != rhs.ownerAddress {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Panacea_Aol_V2_MsgCreateTopicResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCreateTopicResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Aol_V2_MsgCreateTopicResponse, rhs: Panacea_Aol_V2_MsgCreateTopicResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Panacea_Aol_V2_MsgAddWriter: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgAddWriter"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "topic_name"),
    2: .same(proto: "moniker"),
    3: .same(proto: "description"),
    4: .standard(proto: "writer_address"),
    5: .standard(proto: "owner_address"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.topicName) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.moniker) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.writerAddress) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.ownerAddress) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.topicName.isEmpty {
      try visitor.visitSingularStringField(value: self.topicName, fieldNumber: 1)
    }
    if !self.moniker.isEmpty {
      try visitor.visitSingularStringField(value: self.moniker, fieldNumber: 2)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 3)
    }
    if !self.writerAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.writerAddress, fieldNumber: 4)
    }
    if !self.ownerAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.ownerAddress, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Aol_V2_MsgAddWriter, rhs: Panacea_Aol_V2_MsgAddWriter) -> Bool {
    if lhs.topicName != rhs.topicName {return false}
    if lhs.moniker != rhs.moniker {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.writerAddress != rhs.writerAddress {return false}
    if lhs.ownerAddress != rhs.ownerAddress {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Panacea_Aol_V2_MsgAddWriterResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgAddWriterResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Aol_V2_MsgAddWriterResponse, rhs: Panacea_Aol_V2_MsgAddWriterResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Panacea_Aol_V2_MsgDeleteWriter: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgDeleteWriter"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "topic_name"),
    2: .standard(proto: "writer_address"),
    3: .standard(proto: "owner_address"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.topicName) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.writerAddress) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.ownerAddress) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.topicName.isEmpty {
      try visitor.visitSingularStringField(value: self.topicName, fieldNumber: 1)
    }
    if !self.writerAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.writerAddress, fieldNumber: 2)
    }
    if !self.ownerAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.ownerAddress, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Aol_V2_MsgDeleteWriter, rhs: Panacea_Aol_V2_MsgDeleteWriter) -> Bool {
    if lhs.topicName != rhs.topicName {return false}
    if lhs.writerAddress != rhs.writerAddress {return false}
    if lhs.ownerAddress != rhs.ownerAddress {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Panacea_Aol_V2_MsgDeleteWriterResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgDeleteWriterResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Aol_V2_MsgDeleteWriterResponse, rhs: Panacea_Aol_V2_MsgDeleteWriterResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Panacea_Aol_V2_MsgAddRecord: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgAddRecord"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "topic_name"),
    2: .same(proto: "key"),
    3: .same(proto: "value"),
    4: .standard(proto: "writer_address"),
    5: .standard(proto: "owner_address"),
    6: .standard(proto: "fee_payer_address"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.topicName) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.key) }()
      case 3: try { try decoder.decodeSingularBytesField(value: &self.value) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.writerAddress) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.ownerAddress) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.feePayerAddress) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.topicName.isEmpty {
      try visitor.visitSingularStringField(value: self.topicName, fieldNumber: 1)
    }
    if !self.key.isEmpty {
      try visitor.visitSingularBytesField(value: self.key, fieldNumber: 2)
    }
    if !self.value.isEmpty {
      try visitor.visitSingularBytesField(value: self.value, fieldNumber: 3)
    }
    if !self.writerAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.writerAddress, fieldNumber: 4)
    }
    if !self.ownerAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.ownerAddress, fieldNumber: 5)
    }
    if !self.feePayerAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.feePayerAddress, fieldNumber: 6)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Aol_V2_MsgAddRecord, rhs: Panacea_Aol_V2_MsgAddRecord) -> Bool {
    if lhs.topicName != rhs.topicName {return false}
    if lhs.key != rhs.key {return false}
    if lhs.value != rhs.value {return false}
    if lhs.writerAddress != rhs.writerAddress {return false}
    if lhs.ownerAddress != rhs.ownerAddress {return false}
    if lhs.feePayerAddress != rhs.feePayerAddress {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Panacea_Aol_V2_MsgAddRecordResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgAddRecordResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "owner_address"),
    2: .standard(proto: "topic_name"),
    3: .same(proto: "offset"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.ownerAddress) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.topicName) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.offset) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.ownerAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.ownerAddress, fieldNumber: 1)
    }
    if !self.topicName.isEmpty {
      try visitor.visitSingularStringField(value: self.topicName, fieldNumber: 2)
    }
    if self.offset != 0 {
      try visitor.visitSingularUInt64Field(value: self.offset, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Aol_V2_MsgAddRecordResponse, rhs: Panacea_Aol_V2_MsgAddRecordResponse) -> Bool {
    if lhs.ownerAddress != rhs.ownerAddress {return false}
    if lhs.topicName != rhs.topicName {return false}
    if lhs.offset != rhs.offset {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
