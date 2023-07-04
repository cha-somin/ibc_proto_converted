// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: lum-network/millions/genesis.proto
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

struct Lum_Network_Millions_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var params: Lum_Network_Millions_Params {
    get {return _storage._params ?? Lum_Network_Millions_Params()}
    set {_uniqueStorage()._params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return _storage._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {_uniqueStorage()._params = nil}

  var nextPoolID: UInt64 {
    get {return _storage._nextPoolID}
    set {_uniqueStorage()._nextPoolID = newValue}
  }

  var nextDepositID: UInt64 {
    get {return _storage._nextDepositID}
    set {_uniqueStorage()._nextDepositID = newValue}
  }

  var nextPrizeID: UInt64 {
    get {return _storage._nextPrizeID}
    set {_uniqueStorage()._nextPrizeID = newValue}
  }

  var nextWithdrawalID: UInt64 {
    get {return _storage._nextWithdrawalID}
    set {_uniqueStorage()._nextWithdrawalID = newValue}
  }

  var pools: [Lum_Network_Millions_Pool] {
    get {return _storage._pools}
    set {_uniqueStorage()._pools = newValue}
  }

  var deposits: [Lum_Network_Millions_Deposit] {
    get {return _storage._deposits}
    set {_uniqueStorage()._deposits = newValue}
  }

  var draws: [Lum_Network_Millions_Draw] {
    get {return _storage._draws}
    set {_uniqueStorage()._draws = newValue}
  }

  var prizes: [Lum_Network_Millions_Prize] {
    get {return _storage._prizes}
    set {_uniqueStorage()._prizes = newValue}
  }

  var withdrawals: [Lum_Network_Millions_Withdrawal] {
    get {return _storage._withdrawals}
    set {_uniqueStorage()._withdrawals = newValue}
  }

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Lum_Network_Millions_GenesisState: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "lum.network.millions"

extension Lum_Network_Millions_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "params"),
    2: .standard(proto: "next_pool_id"),
    3: .standard(proto: "next_deposit_id"),
    4: .standard(proto: "next_prize_id"),
    5: .standard(proto: "next_withdrawal_id"),
    6: .same(proto: "pools"),
    7: .same(proto: "deposits"),
    8: .same(proto: "draws"),
    9: .same(proto: "prizes"),
    10: .same(proto: "withdrawals"),
  ]

  fileprivate class _StorageClass {
    var _params: Lum_Network_Millions_Params? = nil
    var _nextPoolID: UInt64 = 0
    var _nextDepositID: UInt64 = 0
    var _nextPrizeID: UInt64 = 0
    var _nextWithdrawalID: UInt64 = 0
    var _pools: [Lum_Network_Millions_Pool] = []
    var _deposits: [Lum_Network_Millions_Deposit] = []
    var _draws: [Lum_Network_Millions_Draw] = []
    var _prizes: [Lum_Network_Millions_Prize] = []
    var _withdrawals: [Lum_Network_Millions_Withdrawal] = []

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _params = source._params
      _nextPoolID = source._nextPoolID
      _nextDepositID = source._nextDepositID
      _nextPrizeID = source._nextPrizeID
      _nextWithdrawalID = source._nextWithdrawalID
      _pools = source._pools
      _deposits = source._deposits
      _draws = source._draws
      _prizes = source._prizes
      _withdrawals = source._withdrawals
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
        case 1: try { try decoder.decodeSingularMessageField(value: &_storage._params) }()
        case 2: try { try decoder.decodeSingularUInt64Field(value: &_storage._nextPoolID) }()
        case 3: try { try decoder.decodeSingularUInt64Field(value: &_storage._nextDepositID) }()
        case 4: try { try decoder.decodeSingularUInt64Field(value: &_storage._nextPrizeID) }()
        case 5: try { try decoder.decodeSingularUInt64Field(value: &_storage._nextWithdrawalID) }()
        case 6: try { try decoder.decodeRepeatedMessageField(value: &_storage._pools) }()
        case 7: try { try decoder.decodeRepeatedMessageField(value: &_storage._deposits) }()
        case 8: try { try decoder.decodeRepeatedMessageField(value: &_storage._draws) }()
        case 9: try { try decoder.decodeRepeatedMessageField(value: &_storage._prizes) }()
        case 10: try { try decoder.decodeRepeatedMessageField(value: &_storage._withdrawals) }()
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
      try { if let v = _storage._params {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
      } }()
      if _storage._nextPoolID != 0 {
        try visitor.visitSingularUInt64Field(value: _storage._nextPoolID, fieldNumber: 2)
      }
      if _storage._nextDepositID != 0 {
        try visitor.visitSingularUInt64Field(value: _storage._nextDepositID, fieldNumber: 3)
      }
      if _storage._nextPrizeID != 0 {
        try visitor.visitSingularUInt64Field(value: _storage._nextPrizeID, fieldNumber: 4)
      }
      if _storage._nextWithdrawalID != 0 {
        try visitor.visitSingularUInt64Field(value: _storage._nextWithdrawalID, fieldNumber: 5)
      }
      if !_storage._pools.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._pools, fieldNumber: 6)
      }
      if !_storage._deposits.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._deposits, fieldNumber: 7)
      }
      if !_storage._draws.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._draws, fieldNumber: 8)
      }
      if !_storage._prizes.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._prizes, fieldNumber: 9)
      }
      if !_storage._withdrawals.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._withdrawals, fieldNumber: 10)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Lum_Network_Millions_GenesisState, rhs: Lum_Network_Millions_GenesisState) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._params != rhs_storage._params {return false}
        if _storage._nextPoolID != rhs_storage._nextPoolID {return false}
        if _storage._nextDepositID != rhs_storage._nextDepositID {return false}
        if _storage._nextPrizeID != rhs_storage._nextPrizeID {return false}
        if _storage._nextWithdrawalID != rhs_storage._nextWithdrawalID {return false}
        if _storage._pools != rhs_storage._pools {return false}
        if _storage._deposits != rhs_storage._deposits {return false}
        if _storage._draws != rhs_storage._draws {return false}
        if _storage._prizes != rhs_storage._prizes {return false}
        if _storage._withdrawals != rhs_storage._withdrawals {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}