// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: comdex/locker/v1beta1/tx.proto
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

struct Comdex_Locker_V1beta1_MsgCreateLockerRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var depositor: String = String()

  var amount: String = String()

  var assetID: UInt64 = 0

  var appID: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Comdex_Locker_V1beta1_MsgCreateLockerResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Comdex_Locker_V1beta1_MsgAddWhiteListedAssetRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var from: String = String()

  var appID: UInt64 = 0

  var assetID: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Comdex_Locker_V1beta1_MsgAddWhiteListedAssetResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Comdex_Locker_V1beta1_MsgDepositAssetRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var depositor: String = String()

  var lockerID: UInt64 = 0

  var amount: String = String()

  var assetID: UInt64 = 0

  var appID: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Comdex_Locker_V1beta1_MsgDepositAssetResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Comdex_Locker_V1beta1_MsgWithdrawAssetRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var depositor: String = String()

  var lockerID: UInt64 = 0

  var amount: String = String()

  var assetID: UInt64 = 0

  var appID: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Comdex_Locker_V1beta1_MsgWithdrawAssetResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Comdex_Locker_V1beta1_MsgCloseLockerRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var depositor: String = String()

  var appID: UInt64 = 0

  var assetID: UInt64 = 0

  var lockerID: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Comdex_Locker_V1beta1_MsgCloseLockerResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Comdex_Locker_V1beta1_MsgLockerRewardCalcRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var from: String = String()

  var appID: UInt64 = 0

  var lockerID: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Comdex_Locker_V1beta1_MsgLockerRewardCalcResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Comdex_Locker_V1beta1_MsgCreateLockerRequest: @unchecked Sendable {}
extension Comdex_Locker_V1beta1_MsgCreateLockerResponse: @unchecked Sendable {}
extension Comdex_Locker_V1beta1_MsgAddWhiteListedAssetRequest: @unchecked Sendable {}
extension Comdex_Locker_V1beta1_MsgAddWhiteListedAssetResponse: @unchecked Sendable {}
extension Comdex_Locker_V1beta1_MsgDepositAssetRequest: @unchecked Sendable {}
extension Comdex_Locker_V1beta1_MsgDepositAssetResponse: @unchecked Sendable {}
extension Comdex_Locker_V1beta1_MsgWithdrawAssetRequest: @unchecked Sendable {}
extension Comdex_Locker_V1beta1_MsgWithdrawAssetResponse: @unchecked Sendable {}
extension Comdex_Locker_V1beta1_MsgCloseLockerRequest: @unchecked Sendable {}
extension Comdex_Locker_V1beta1_MsgCloseLockerResponse: @unchecked Sendable {}
extension Comdex_Locker_V1beta1_MsgLockerRewardCalcRequest: @unchecked Sendable {}
extension Comdex_Locker_V1beta1_MsgLockerRewardCalcResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "comdex.locker.v1beta1"

extension Comdex_Locker_V1beta1_MsgCreateLockerRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCreateLockerRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "depositor"),
    2: .same(proto: "amount"),
    3: .standard(proto: "asset_id"),
    4: .standard(proto: "app_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.depositor) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.amount) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.assetID) }()
      case 4: try { try decoder.decodeSingularUInt64Field(value: &self.appID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.depositor.isEmpty {
      try visitor.visitSingularStringField(value: self.depositor, fieldNumber: 1)
    }
    if !self.amount.isEmpty {
      try visitor.visitSingularStringField(value: self.amount, fieldNumber: 2)
    }
    if self.assetID != 0 {
      try visitor.visitSingularUInt64Field(value: self.assetID, fieldNumber: 3)
    }
    if self.appID != 0 {
      try visitor.visitSingularUInt64Field(value: self.appID, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Comdex_Locker_V1beta1_MsgCreateLockerRequest, rhs: Comdex_Locker_V1beta1_MsgCreateLockerRequest) -> Bool {
    if lhs.depositor != rhs.depositor {return false}
    if lhs.amount != rhs.amount {return false}
    if lhs.assetID != rhs.assetID {return false}
    if lhs.appID != rhs.appID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Comdex_Locker_V1beta1_MsgCreateLockerResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCreateLockerResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Comdex_Locker_V1beta1_MsgCreateLockerResponse, rhs: Comdex_Locker_V1beta1_MsgCreateLockerResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Comdex_Locker_V1beta1_MsgAddWhiteListedAssetRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgAddWhiteListedAssetRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "from"),
    2: .standard(proto: "app_id"),
    3: .standard(proto: "asset_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.from) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.appID) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.assetID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.from.isEmpty {
      try visitor.visitSingularStringField(value: self.from, fieldNumber: 1)
    }
    if self.appID != 0 {
      try visitor.visitSingularUInt64Field(value: self.appID, fieldNumber: 2)
    }
    if self.assetID != 0 {
      try visitor.visitSingularUInt64Field(value: self.assetID, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Comdex_Locker_V1beta1_MsgAddWhiteListedAssetRequest, rhs: Comdex_Locker_V1beta1_MsgAddWhiteListedAssetRequest) -> Bool {
    if lhs.from != rhs.from {return false}
    if lhs.appID != rhs.appID {return false}
    if lhs.assetID != rhs.assetID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Comdex_Locker_V1beta1_MsgAddWhiteListedAssetResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgAddWhiteListedAssetResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Comdex_Locker_V1beta1_MsgAddWhiteListedAssetResponse, rhs: Comdex_Locker_V1beta1_MsgAddWhiteListedAssetResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Comdex_Locker_V1beta1_MsgDepositAssetRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgDepositAssetRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "depositor"),
    2: .standard(proto: "locker_id"),
    3: .same(proto: "amount"),
    4: .standard(proto: "asset_id"),
    5: .standard(proto: "app_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.depositor) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.lockerID) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.amount) }()
      case 4: try { try decoder.decodeSingularUInt64Field(value: &self.assetID) }()
      case 5: try { try decoder.decodeSingularUInt64Field(value: &self.appID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.depositor.isEmpty {
      try visitor.visitSingularStringField(value: self.depositor, fieldNumber: 1)
    }
    if self.lockerID != 0 {
      try visitor.visitSingularUInt64Field(value: self.lockerID, fieldNumber: 2)
    }
    if !self.amount.isEmpty {
      try visitor.visitSingularStringField(value: self.amount, fieldNumber: 3)
    }
    if self.assetID != 0 {
      try visitor.visitSingularUInt64Field(value: self.assetID, fieldNumber: 4)
    }
    if self.appID != 0 {
      try visitor.visitSingularUInt64Field(value: self.appID, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Comdex_Locker_V1beta1_MsgDepositAssetRequest, rhs: Comdex_Locker_V1beta1_MsgDepositAssetRequest) -> Bool {
    if lhs.depositor != rhs.depositor {return false}
    if lhs.lockerID != rhs.lockerID {return false}
    if lhs.amount != rhs.amount {return false}
    if lhs.assetID != rhs.assetID {return false}
    if lhs.appID != rhs.appID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Comdex_Locker_V1beta1_MsgDepositAssetResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgDepositAssetResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Comdex_Locker_V1beta1_MsgDepositAssetResponse, rhs: Comdex_Locker_V1beta1_MsgDepositAssetResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Comdex_Locker_V1beta1_MsgWithdrawAssetRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgWithdrawAssetRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "depositor"),
    2: .standard(proto: "locker_id"),
    3: .same(proto: "amount"),
    4: .standard(proto: "asset_id"),
    5: .standard(proto: "app_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.depositor) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.lockerID) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.amount) }()
      case 4: try { try decoder.decodeSingularUInt64Field(value: &self.assetID) }()
      case 5: try { try decoder.decodeSingularUInt64Field(value: &self.appID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.depositor.isEmpty {
      try visitor.visitSingularStringField(value: self.depositor, fieldNumber: 1)
    }
    if self.lockerID != 0 {
      try visitor.visitSingularUInt64Field(value: self.lockerID, fieldNumber: 2)
    }
    if !self.amount.isEmpty {
      try visitor.visitSingularStringField(value: self.amount, fieldNumber: 3)
    }
    if self.assetID != 0 {
      try visitor.visitSingularUInt64Field(value: self.assetID, fieldNumber: 4)
    }
    if self.appID != 0 {
      try visitor.visitSingularUInt64Field(value: self.appID, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Comdex_Locker_V1beta1_MsgWithdrawAssetRequest, rhs: Comdex_Locker_V1beta1_MsgWithdrawAssetRequest) -> Bool {
    if lhs.depositor != rhs.depositor {return false}
    if lhs.lockerID != rhs.lockerID {return false}
    if lhs.amount != rhs.amount {return false}
    if lhs.assetID != rhs.assetID {return false}
    if lhs.appID != rhs.appID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Comdex_Locker_V1beta1_MsgWithdrawAssetResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgWithdrawAssetResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Comdex_Locker_V1beta1_MsgWithdrawAssetResponse, rhs: Comdex_Locker_V1beta1_MsgWithdrawAssetResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Comdex_Locker_V1beta1_MsgCloseLockerRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCloseLockerRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "depositor"),
    2: .standard(proto: "app_id"),
    3: .standard(proto: "asset_id"),
    4: .standard(proto: "locker_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.depositor) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.appID) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.assetID) }()
      case 4: try { try decoder.decodeSingularUInt64Field(value: &self.lockerID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.depositor.isEmpty {
      try visitor.visitSingularStringField(value: self.depositor, fieldNumber: 1)
    }
    if self.appID != 0 {
      try visitor.visitSingularUInt64Field(value: self.appID, fieldNumber: 2)
    }
    if self.assetID != 0 {
      try visitor.visitSingularUInt64Field(value: self.assetID, fieldNumber: 3)
    }
    if self.lockerID != 0 {
      try visitor.visitSingularUInt64Field(value: self.lockerID, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Comdex_Locker_V1beta1_MsgCloseLockerRequest, rhs: Comdex_Locker_V1beta1_MsgCloseLockerRequest) -> Bool {
    if lhs.depositor != rhs.depositor {return false}
    if lhs.appID != rhs.appID {return false}
    if lhs.assetID != rhs.assetID {return false}
    if lhs.lockerID != rhs.lockerID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Comdex_Locker_V1beta1_MsgCloseLockerResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCloseLockerResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Comdex_Locker_V1beta1_MsgCloseLockerResponse, rhs: Comdex_Locker_V1beta1_MsgCloseLockerResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Comdex_Locker_V1beta1_MsgLockerRewardCalcRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgLockerRewardCalcRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "from"),
    2: .standard(proto: "app_id"),
    3: .standard(proto: "locker_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.from) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.appID) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.lockerID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.from.isEmpty {
      try visitor.visitSingularStringField(value: self.from, fieldNumber: 1)
    }
    if self.appID != 0 {
      try visitor.visitSingularUInt64Field(value: self.appID, fieldNumber: 2)
    }
    if self.lockerID != 0 {
      try visitor.visitSingularUInt64Field(value: self.lockerID, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Comdex_Locker_V1beta1_MsgLockerRewardCalcRequest, rhs: Comdex_Locker_V1beta1_MsgLockerRewardCalcRequest) -> Bool {
    if lhs.from != rhs.from {return false}
    if lhs.appID != rhs.appID {return false}
    if lhs.lockerID != rhs.lockerID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Comdex_Locker_V1beta1_MsgLockerRewardCalcResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgLockerRewardCalcResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Comdex_Locker_V1beta1_MsgLockerRewardCalcResponse, rhs: Comdex_Locker_V1beta1_MsgLockerRewardCalcResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
