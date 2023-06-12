// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: kava/cdp/v1beta1/cdp.proto
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

/// CDP defines the state of a single collateralized debt position.
struct Kava_Cdp_V1beta1_CDP {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: UInt64 = 0

  var owner: Data = Data()

  var type: String = String()

  var collateral: Cosmos_Base_V1beta1_Coin {
    get {return _collateral ?? Cosmos_Base_V1beta1_Coin()}
    set {_collateral = newValue}
  }
  /// Returns true if `collateral` has been explicitly set.
  var hasCollateral: Bool {return self._collateral != nil}
  /// Clears the value of `collateral`. Subsequent reads from it will return its default value.
  mutating func clearCollateral() {self._collateral = nil}

  var principal: Cosmos_Base_V1beta1_Coin {
    get {return _principal ?? Cosmos_Base_V1beta1_Coin()}
    set {_principal = newValue}
  }
  /// Returns true if `principal` has been explicitly set.
  var hasPrincipal: Bool {return self._principal != nil}
  /// Clears the value of `principal`. Subsequent reads from it will return its default value.
  mutating func clearPrincipal() {self._principal = nil}

  var accumulatedFees: Cosmos_Base_V1beta1_Coin {
    get {return _accumulatedFees ?? Cosmos_Base_V1beta1_Coin()}
    set {_accumulatedFees = newValue}
  }
  /// Returns true if `accumulatedFees` has been explicitly set.
  var hasAccumulatedFees: Bool {return self._accumulatedFees != nil}
  /// Clears the value of `accumulatedFees`. Subsequent reads from it will return its default value.
  mutating func clearAccumulatedFees() {self._accumulatedFees = nil}

  var feesUpdated: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _feesUpdated ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_feesUpdated = newValue}
  }
  /// Returns true if `feesUpdated` has been explicitly set.
  var hasFeesUpdated: Bool {return self._feesUpdated != nil}
  /// Clears the value of `feesUpdated`. Subsequent reads from it will return its default value.
  mutating func clearFeesUpdated() {self._feesUpdated = nil}

  var interestFactor: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _collateral: Cosmos_Base_V1beta1_Coin? = nil
  fileprivate var _principal: Cosmos_Base_V1beta1_Coin? = nil
  fileprivate var _accumulatedFees: Cosmos_Base_V1beta1_Coin? = nil
  fileprivate var _feesUpdated: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

/// Deposit defines an amount of coins deposited by an account to a cdp
struct Kava_Cdp_V1beta1_Deposit {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var cdpID: UInt64 = 0

  var depositor: String = String()

  var amount: Cosmos_Base_V1beta1_Coin {
    get {return _amount ?? Cosmos_Base_V1beta1_Coin()}
    set {_amount = newValue}
  }
  /// Returns true if `amount` has been explicitly set.
  var hasAmount: Bool {return self._amount != nil}
  /// Clears the value of `amount`. Subsequent reads from it will return its default value.
  mutating func clearAmount() {self._amount = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _amount: Cosmos_Base_V1beta1_Coin? = nil
}

/// TotalPrincipal defines the total principal of a given collateral type
struct Kava_Cdp_V1beta1_TotalPrincipal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var collateralType: String = String()

  var amount: Cosmos_Base_V1beta1_Coin {
    get {return _amount ?? Cosmos_Base_V1beta1_Coin()}
    set {_amount = newValue}
  }
  /// Returns true if `amount` has been explicitly set.
  var hasAmount: Bool {return self._amount != nil}
  /// Clears the value of `amount`. Subsequent reads from it will return its default value.
  mutating func clearAmount() {self._amount = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _amount: Cosmos_Base_V1beta1_Coin? = nil
}

/// TotalCollateral defines the total collateral of a given collateral type
struct Kava_Cdp_V1beta1_TotalCollateral {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var collateralType: String = String()

  var amount: Cosmos_Base_V1beta1_Coin {
    get {return _amount ?? Cosmos_Base_V1beta1_Coin()}
    set {_amount = newValue}
  }
  /// Returns true if `amount` has been explicitly set.
  var hasAmount: Bool {return self._amount != nil}
  /// Clears the value of `amount`. Subsequent reads from it will return its default value.
  mutating func clearAmount() {self._amount = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _amount: Cosmos_Base_V1beta1_Coin? = nil
}

/// OwnerCDPIndex defines the cdp ids for a single cdp owner
struct Kava_Cdp_V1beta1_OwnerCDPIndex {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var cdpIds: [UInt64] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Kava_Cdp_V1beta1_CDP: @unchecked Sendable {}
extension Kava_Cdp_V1beta1_Deposit: @unchecked Sendable {}
extension Kava_Cdp_V1beta1_TotalPrincipal: @unchecked Sendable {}
extension Kava_Cdp_V1beta1_TotalCollateral: @unchecked Sendable {}
extension Kava_Cdp_V1beta1_OwnerCDPIndex: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "kava.cdp.v1beta1"

extension Kava_Cdp_V1beta1_CDP: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".CDP"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "owner"),
    3: .same(proto: "type"),
    4: .same(proto: "collateral"),
    5: .same(proto: "principal"),
    6: .standard(proto: "accumulated_fees"),
    7: .standard(proto: "fees_updated"),
    8: .standard(proto: "interest_factor"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.owner) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.type) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._collateral) }()
      case 5: try { try decoder.decodeSingularMessageField(value: &self._principal) }()
      case 6: try { try decoder.decodeSingularMessageField(value: &self._accumulatedFees) }()
      case 7: try { try decoder.decodeSingularMessageField(value: &self._feesUpdated) }()
      case 8: try { try decoder.decodeSingularStringField(value: &self.interestFactor) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 1)
    }
    if !self.owner.isEmpty {
      try visitor.visitSingularBytesField(value: self.owner, fieldNumber: 2)
    }
    if !self.type.isEmpty {
      try visitor.visitSingularStringField(value: self.type, fieldNumber: 3)
    }
    try { if let v = self._collateral {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    try { if let v = self._principal {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
    } }()
    try { if let v = self._accumulatedFees {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
    } }()
    try { if let v = self._feesUpdated {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 7)
    } }()
    if !self.interestFactor.isEmpty {
      try visitor.visitSingularStringField(value: self.interestFactor, fieldNumber: 8)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kava_Cdp_V1beta1_CDP, rhs: Kava_Cdp_V1beta1_CDP) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.owner != rhs.owner {return false}
    if lhs.type != rhs.type {return false}
    if lhs._collateral != rhs._collateral {return false}
    if lhs._principal != rhs._principal {return false}
    if lhs._accumulatedFees != rhs._accumulatedFees {return false}
    if lhs._feesUpdated != rhs._feesUpdated {return false}
    if lhs.interestFactor != rhs.interestFactor {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kava_Cdp_V1beta1_Deposit: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Deposit"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "cdp_id"),
    2: .same(proto: "depositor"),
    3: .same(proto: "amount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.cdpID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.depositor) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._amount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.cdpID != 0 {
      try visitor.visitSingularUInt64Field(value: self.cdpID, fieldNumber: 1)
    }
    if !self.depositor.isEmpty {
      try visitor.visitSingularStringField(value: self.depositor, fieldNumber: 2)
    }
    try { if let v = self._amount {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kava_Cdp_V1beta1_Deposit, rhs: Kava_Cdp_V1beta1_Deposit) -> Bool {
    if lhs.cdpID != rhs.cdpID {return false}
    if lhs.depositor != rhs.depositor {return false}
    if lhs._amount != rhs._amount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kava_Cdp_V1beta1_TotalPrincipal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".TotalPrincipal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "collateral_type"),
    2: .same(proto: "amount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.collateralType) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._amount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.collateralType.isEmpty {
      try visitor.visitSingularStringField(value: self.collateralType, fieldNumber: 1)
    }
    try { if let v = self._amount {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kava_Cdp_V1beta1_TotalPrincipal, rhs: Kava_Cdp_V1beta1_TotalPrincipal) -> Bool {
    if lhs.collateralType != rhs.collateralType {return false}
    if lhs._amount != rhs._amount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kava_Cdp_V1beta1_TotalCollateral: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".TotalCollateral"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "collateral_type"),
    2: .same(proto: "amount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.collateralType) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._amount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.collateralType.isEmpty {
      try visitor.visitSingularStringField(value: self.collateralType, fieldNumber: 1)
    }
    try { if let v = self._amount {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kava_Cdp_V1beta1_TotalCollateral, rhs: Kava_Cdp_V1beta1_TotalCollateral) -> Bool {
    if lhs.collateralType != rhs.collateralType {return false}
    if lhs._amount != rhs._amount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kava_Cdp_V1beta1_OwnerCDPIndex: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".OwnerCDPIndex"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "cdp_ids"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedUInt64Field(value: &self.cdpIds) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.cdpIds.isEmpty {
      try visitor.visitPackedUInt64Field(value: self.cdpIds, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kava_Cdp_V1beta1_OwnerCDPIndex, rhs: Kava_Cdp_V1beta1_OwnerCDPIndex) -> Bool {
    if lhs.cdpIds != rhs.cdpIds {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
