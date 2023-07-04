// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: axelar/evm/v1beta1/params.proto
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

/// Params is the parameter set for this module
struct Axelar_Evm_V1beta1_Params {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var chain: String = String()

  var confirmationHeight: UInt64 = 0

  var network: String = String()

  var tokenCode: Data = Data()

  var burnable: Data = Data()

  var revoteLockingPeriod: Int64 = 0

  var networks: [Axelar_Evm_V1beta1_NetworkInfo] = []

  var votingThreshold: Axelar_Utils_V1beta1_Threshold {
    get {return _votingThreshold ?? Axelar_Utils_V1beta1_Threshold()}
    set {_votingThreshold = newValue}
  }
  /// Returns true if `votingThreshold` has been explicitly set.
  var hasVotingThreshold: Bool {return self._votingThreshold != nil}
  /// Clears the value of `votingThreshold`. Subsequent reads from it will return its default value.
  mutating func clearVotingThreshold() {self._votingThreshold = nil}

  var minVoterCount: Int64 = 0

  var commandsGasLimit: UInt32 = 0

  var votingGracePeriod: Int64 = 0

  var endBlockerLimit: Int64 = 0

  var transferLimit: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _votingThreshold: Axelar_Utils_V1beta1_Threshold? = nil
}

struct Axelar_Evm_V1beta1_PendingChain {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var params: Axelar_Evm_V1beta1_Params {
    get {return _storage._params ?? Axelar_Evm_V1beta1_Params()}
    set {_uniqueStorage()._params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return _storage._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {_uniqueStorage()._params = nil}

  var chain: Axelar_Nexus_Exported_V1beta1_Chain {
    get {return _storage._chain ?? Axelar_Nexus_Exported_V1beta1_Chain()}
    set {_uniqueStorage()._chain = newValue}
  }
  /// Returns true if `chain` has been explicitly set.
  var hasChain: Bool {return _storage._chain != nil}
  /// Clears the value of `chain`. Subsequent reads from it will return its default value.
  mutating func clearChain() {_uniqueStorage()._chain = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Axelar_Evm_V1beta1_Params: @unchecked Sendable {}
extension Axelar_Evm_V1beta1_PendingChain: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "axelar.evm.v1beta1"

extension Axelar_Evm_V1beta1_Params: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Params"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "chain"),
    2: .standard(proto: "confirmation_height"),
    3: .same(proto: "network"),
    5: .standard(proto: "token_code"),
    6: .same(proto: "burnable"),
    7: .standard(proto: "revote_locking_period"),
    8: .same(proto: "networks"),
    9: .standard(proto: "voting_threshold"),
    10: .standard(proto: "min_voter_count"),
    11: .standard(proto: "commands_gas_limit"),
    13: .standard(proto: "voting_grace_period"),
    14: .standard(proto: "end_blocker_limit"),
    15: .standard(proto: "transfer_limit"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.chain) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.confirmationHeight) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.network) }()
      case 5: try { try decoder.decodeSingularBytesField(value: &self.tokenCode) }()
      case 6: try { try decoder.decodeSingularBytesField(value: &self.burnable) }()
      case 7: try { try decoder.decodeSingularInt64Field(value: &self.revoteLockingPeriod) }()
      case 8: try { try decoder.decodeRepeatedMessageField(value: &self.networks) }()
      case 9: try { try decoder.decodeSingularMessageField(value: &self._votingThreshold) }()
      case 10: try { try decoder.decodeSingularInt64Field(value: &self.minVoterCount) }()
      case 11: try { try decoder.decodeSingularUInt32Field(value: &self.commandsGasLimit) }()
      case 13: try { try decoder.decodeSingularInt64Field(value: &self.votingGracePeriod) }()
      case 14: try { try decoder.decodeSingularInt64Field(value: &self.endBlockerLimit) }()
      case 15: try { try decoder.decodeSingularUInt64Field(value: &self.transferLimit) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.chain.isEmpty {
      try visitor.visitSingularStringField(value: self.chain, fieldNumber: 1)
    }
    if self.confirmationHeight != 0 {
      try visitor.visitSingularUInt64Field(value: self.confirmationHeight, fieldNumber: 2)
    }
    if !self.network.isEmpty {
      try visitor.visitSingularStringField(value: self.network, fieldNumber: 3)
    }
    if !self.tokenCode.isEmpty {
      try visitor.visitSingularBytesField(value: self.tokenCode, fieldNumber: 5)
    }
    if !self.burnable.isEmpty {
      try visitor.visitSingularBytesField(value: self.burnable, fieldNumber: 6)
    }
    if self.revoteLockingPeriod != 0 {
      try visitor.visitSingularInt64Field(value: self.revoteLockingPeriod, fieldNumber: 7)
    }
    if !self.networks.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.networks, fieldNumber: 8)
    }
    try { if let v = self._votingThreshold {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 9)
    } }()
    if self.minVoterCount != 0 {
      try visitor.visitSingularInt64Field(value: self.minVoterCount, fieldNumber: 10)
    }
    if self.commandsGasLimit != 0 {
      try visitor.visitSingularUInt32Field(value: self.commandsGasLimit, fieldNumber: 11)
    }
    if self.votingGracePeriod != 0 {
      try visitor.visitSingularInt64Field(value: self.votingGracePeriod, fieldNumber: 13)
    }
    if self.endBlockerLimit != 0 {
      try visitor.visitSingularInt64Field(value: self.endBlockerLimit, fieldNumber: 14)
    }
    if self.transferLimit != 0 {
      try visitor.visitSingularUInt64Field(value: self.transferLimit, fieldNumber: 15)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Evm_V1beta1_Params, rhs: Axelar_Evm_V1beta1_Params) -> Bool {
    if lhs.chain != rhs.chain {return false}
    if lhs.confirmationHeight != rhs.confirmationHeight {return false}
    if lhs.network != rhs.network {return false}
    if lhs.tokenCode != rhs.tokenCode {return false}
    if lhs.burnable != rhs.burnable {return false}
    if lhs.revoteLockingPeriod != rhs.revoteLockingPeriod {return false}
    if lhs.networks != rhs.networks {return false}
    if lhs._votingThreshold != rhs._votingThreshold {return false}
    if lhs.minVoterCount != rhs.minVoterCount {return false}
    if lhs.commandsGasLimit != rhs.commandsGasLimit {return false}
    if lhs.votingGracePeriod != rhs.votingGracePeriod {return false}
    if lhs.endBlockerLimit != rhs.endBlockerLimit {return false}
    if lhs.transferLimit != rhs.transferLimit {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Axelar_Evm_V1beta1_PendingChain: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".PendingChain"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "params"),
    2: .same(proto: "chain"),
  ]

  fileprivate class _StorageClass {
    var _params: Axelar_Evm_V1beta1_Params? = nil
    var _chain: Axelar_Nexus_Exported_V1beta1_Chain? = nil

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _params = source._params
      _chain = source._chain
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
        case 2: try { try decoder.decodeSingularMessageField(value: &_storage._chain) }()
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
      try { if let v = _storage._chain {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
      } }()
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Evm_V1beta1_PendingChain, rhs: Axelar_Evm_V1beta1_PendingChain) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._params != rhs_storage._params {return false}
        if _storage._chain != rhs_storage._chain {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}