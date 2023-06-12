// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: stafihub/rvalidator/tx.proto
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

struct Stafihub_Stafihub_Rvalidator_MsgInitRValidator {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var denom: String = String()

  var poolAddress: String = String()

  var valAddressList: [String] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rvalidator_MsgInitRValidatorResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rvalidator_MsgSetCycleSeconds {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var denom: String = String()

  var seconds: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rvalidator_MsgSetCycleSecondsResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rvalidator_MsgSetShuffleSeconds {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var denom: String = String()

  var seconds: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rvalidator_MsgSetShuffleSecondsResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rvalidator_MsgAddRValidator {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var denom: String = String()

  var poolAddress: String = String()

  var valAddress: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rvalidator_MsgAddRValidatorResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rvalidator_MsgRmRValidator {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var denom: String = String()

  var poolAddress: String = String()

  var oldAddress: String = String()

  var newAddress: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stafihub_Stafihub_Rvalidator_MsgRmRValidatorResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Stafihub_Stafihub_Rvalidator_MsgInitRValidator: @unchecked Sendable {}
extension Stafihub_Stafihub_Rvalidator_MsgInitRValidatorResponse: @unchecked Sendable {}
extension Stafihub_Stafihub_Rvalidator_MsgSetCycleSeconds: @unchecked Sendable {}
extension Stafihub_Stafihub_Rvalidator_MsgSetCycleSecondsResponse: @unchecked Sendable {}
extension Stafihub_Stafihub_Rvalidator_MsgSetShuffleSeconds: @unchecked Sendable {}
extension Stafihub_Stafihub_Rvalidator_MsgSetShuffleSecondsResponse: @unchecked Sendable {}
extension Stafihub_Stafihub_Rvalidator_MsgAddRValidator: @unchecked Sendable {}
extension Stafihub_Stafihub_Rvalidator_MsgAddRValidatorResponse: @unchecked Sendable {}
extension Stafihub_Stafihub_Rvalidator_MsgRmRValidator: @unchecked Sendable {}
extension Stafihub_Stafihub_Rvalidator_MsgRmRValidatorResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "stafihub.stafihub.rvalidator"

extension Stafihub_Stafihub_Rvalidator_MsgInitRValidator: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgInitRValidator"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "denom"),
    3: .same(proto: "poolAddress"),
    4: .same(proto: "valAddressList"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.poolAddress) }()
      case 4: try { try decoder.decodeRepeatedStringField(value: &self.valAddressList) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 2)
    }
    if !self.poolAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.poolAddress, fieldNumber: 3)
    }
    if !self.valAddressList.isEmpty {
      try visitor.visitRepeatedStringField(value: self.valAddressList, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rvalidator_MsgInitRValidator, rhs: Stafihub_Stafihub_Rvalidator_MsgInitRValidator) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.denom != rhs.denom {return false}
    if lhs.poolAddress != rhs.poolAddress {return false}
    if lhs.valAddressList != rhs.valAddressList {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rvalidator_MsgInitRValidatorResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgInitRValidatorResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rvalidator_MsgInitRValidatorResponse, rhs: Stafihub_Stafihub_Rvalidator_MsgInitRValidatorResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rvalidator_MsgSetCycleSeconds: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSetCycleSeconds"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "denom"),
    3: .same(proto: "seconds"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.seconds) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 2)
    }
    if self.seconds != 0 {
      try visitor.visitSingularUInt64Field(value: self.seconds, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rvalidator_MsgSetCycleSeconds, rhs: Stafihub_Stafihub_Rvalidator_MsgSetCycleSeconds) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.denom != rhs.denom {return false}
    if lhs.seconds != rhs.seconds {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rvalidator_MsgSetCycleSecondsResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSetCycleSecondsResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rvalidator_MsgSetCycleSecondsResponse, rhs: Stafihub_Stafihub_Rvalidator_MsgSetCycleSecondsResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rvalidator_MsgSetShuffleSeconds: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSetShuffleSeconds"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "denom"),
    3: .same(proto: "seconds"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.seconds) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 2)
    }
    if self.seconds != 0 {
      try visitor.visitSingularUInt64Field(value: self.seconds, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rvalidator_MsgSetShuffleSeconds, rhs: Stafihub_Stafihub_Rvalidator_MsgSetShuffleSeconds) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.denom != rhs.denom {return false}
    if lhs.seconds != rhs.seconds {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rvalidator_MsgSetShuffleSecondsResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSetShuffleSecondsResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rvalidator_MsgSetShuffleSecondsResponse, rhs: Stafihub_Stafihub_Rvalidator_MsgSetShuffleSecondsResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rvalidator_MsgAddRValidator: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgAddRValidator"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "denom"),
    3: .same(proto: "poolAddress"),
    4: .same(proto: "valAddress"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.poolAddress) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.valAddress) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 2)
    }
    if !self.poolAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.poolAddress, fieldNumber: 3)
    }
    if !self.valAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.valAddress, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rvalidator_MsgAddRValidator, rhs: Stafihub_Stafihub_Rvalidator_MsgAddRValidator) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.denom != rhs.denom {return false}
    if lhs.poolAddress != rhs.poolAddress {return false}
    if lhs.valAddress != rhs.valAddress {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rvalidator_MsgAddRValidatorResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgAddRValidatorResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rvalidator_MsgAddRValidatorResponse, rhs: Stafihub_Stafihub_Rvalidator_MsgAddRValidatorResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rvalidator_MsgRmRValidator: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRmRValidator"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .same(proto: "denom"),
    3: .same(proto: "poolAddress"),
    4: .same(proto: "oldAddress"),
    5: .same(proto: "newAddress"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.poolAddress) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.oldAddress) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.newAddress) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 2)
    }
    if !self.poolAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.poolAddress, fieldNumber: 3)
    }
    if !self.oldAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.oldAddress, fieldNumber: 4)
    }
    if !self.newAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.newAddress, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rvalidator_MsgRmRValidator, rhs: Stafihub_Stafihub_Rvalidator_MsgRmRValidator) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.denom != rhs.denom {return false}
    if lhs.poolAddress != rhs.poolAddress {return false}
    if lhs.oldAddress != rhs.oldAddress {return false}
    if lhs.newAddress != rhs.newAddress {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stafihub_Stafihub_Rvalidator_MsgRmRValidatorResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRmRValidatorResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stafihub_Stafihub_Rvalidator_MsgRmRValidatorResponse, rhs: Stafihub_Stafihub_Rvalidator_MsgRmRValidatorResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
