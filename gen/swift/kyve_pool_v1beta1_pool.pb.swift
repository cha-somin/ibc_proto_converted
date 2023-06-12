// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: kyve/pool/v1beta1/pool.proto
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

/// PoolStatus ...
enum Kyve_Pool_V1beta1_PoolStatus: SwiftProtobuf.Enum {
  typealias RawValue = Int

  /// POOL_STATUS_UNSPECIFIED ...
  case unspecified // = 0

  /// POOL_STATUS_ACTIVE ...
  case active // = 1

  /// POOL_STATUS_DISABLED ...
  case disabled // = 2

  /// POOL_STATUS_NO_FUNDS ...
  case noFunds // = 3

  /// POOL_STATUS_NOT_ENOUGH_DELEGATION ...
  case notEnoughDelegation // = 4

  /// POOL_STATUS_UPGRADING ...
  case upgrading // = 5
  case UNRECOGNIZED(Int)

  init() {
    self = .unspecified
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .unspecified
    case 1: self = .active
    case 2: self = .disabled
    case 3: self = .noFunds
    case 4: self = .notEnoughDelegation
    case 5: self = .upgrading
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .unspecified: return 0
    case .active: return 1
    case .disabled: return 2
    case .noFunds: return 3
    case .notEnoughDelegation: return 4
    case .upgrading: return 5
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Kyve_Pool_V1beta1_PoolStatus: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Kyve_Pool_V1beta1_PoolStatus] = [
    .unspecified,
    .active,
    .disabled,
    .noFunds,
    .notEnoughDelegation,
    .upgrading,
  ]
}

#endif  // swift(>=4.2)

/// Protocol holds all info about the current pool version and the
/// available binaries for participating as a validator in a pool
struct Kyve_Pool_V1beta1_Protocol {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// version holds the current software version tag of the pool binaries
  var version: String = String()

  /// binaries is a stringified json object which holds binaries in the
  /// current version for multiple platforms and architectures
  var binaries: String = String()

  /// last_upgrade is the unix time the pool was upgraded the last time
  var lastUpgrade: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// Upgrade holds all info when a pool has a scheduled upgrade
struct Kyve_Pool_V1beta1_UpgradePlan {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// version is the new software version tag of the upgrade
  var version: String = String()

  /// binaries is the new stringified json object which holds binaries in the
  /// upgrade version for multiple platforms and architectures
  var binaries: String = String()

  /// scheduled_at is the unix time the upgrade is supposed to be done
  var scheduledAt: UInt64 = 0

  /// duration is the time in seconds how long the pool should halt
  /// during the upgrade to give all validators a chance of switching
  /// to the new binaries
  var duration: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// Funder is the object which holds info about a single pool funder
struct Kyve_Pool_V1beta1_Funder {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// address is the address of the funder
  var address: String = String()

  /// amount is the current amount of funds in ukyve the funder has
  /// still funded the pool with
  var amount: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// Pool ...
struct Kyve_Pool_V1beta1_Pool {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// id - unique identifier of the pool, can not be changed
  var id: UInt64 {
    get {return _storage._id}
    set {_uniqueStorage()._id = newValue}
  }

  /// name is a human readable name for the pool
  var name: String {
    get {return _storage._name}
    set {_uniqueStorage()._name = newValue}
  }

  /// runtime specified which protocol and which version needs is required
  var runtime: String {
    get {return _storage._runtime}
    set {_uniqueStorage()._runtime = newValue}
  }

  /// logo is a link to an image file
  var logo: String {
    get {return _storage._logo}
    set {_uniqueStorage()._logo = newValue}
  }

  /// config is either a JSON encoded string or a link to an external storage provider.
  /// This is up to the implementation of the protocol node.
  var config: String {
    get {return _storage._config}
    set {_uniqueStorage()._config = newValue}
  }

  /// start_key ...
  var startKey: String {
    get {return _storage._startKey}
    set {_uniqueStorage()._startKey = newValue}
  }

  /// current_key ...
  var currentKey: String {
    get {return _storage._currentKey}
    set {_uniqueStorage()._currentKey = newValue}
  }

  /// current_summary ...
  var currentSummary: String {
    get {return _storage._currentSummary}
    set {_uniqueStorage()._currentSummary = newValue}
  }

  /// current_index ...
  var currentIndex: UInt64 {
    get {return _storage._currentIndex}
    set {_uniqueStorage()._currentIndex = newValue}
  }

  /// total_bundles is the number of total finalized bundles
  var totalBundles: UInt64 {
    get {return _storage._totalBundles}
    set {_uniqueStorage()._totalBundles = newValue}
  }

  /// upload_interval ...
  var uploadInterval: UInt64 {
    get {return _storage._uploadInterval}
    set {_uniqueStorage()._uploadInterval = newValue}
  }

  /// operating_cost ...
  var operatingCost: UInt64 {
    get {return _storage._operatingCost}
    set {_uniqueStorage()._operatingCost = newValue}
  }

  /// min_delegation ...
  var minDelegation: UInt64 {
    get {return _storage._minDelegation}
    set {_uniqueStorage()._minDelegation = newValue}
  }

  /// max_bundle_size ...
  var maxBundleSize: UInt64 {
    get {return _storage._maxBundleSize}
    set {_uniqueStorage()._maxBundleSize = newValue}
  }

  /// disabled is true when the pool is disabled.
  /// Can only be done via governance.
  var disabled: Bool {
    get {return _storage._disabled}
    set {_uniqueStorage()._disabled = newValue}
  }

  /// funders ...
  var funders: [Kyve_Pool_V1beta1_Funder] {
    get {return _storage._funders}
    set {_uniqueStorage()._funders = newValue}
  }

  /// total_funds ...
  var totalFunds: UInt64 {
    get {return _storage._totalFunds}
    set {_uniqueStorage()._totalFunds = newValue}
  }

  /// protocol ...
  var `protocol`: Kyve_Pool_V1beta1_Protocol {
    get {return _storage._protocol ?? Kyve_Pool_V1beta1_Protocol()}
    set {_uniqueStorage()._protocol = newValue}
  }
  /// Returns true if ``protocol`` has been explicitly set.
  var hasProtocol: Bool {return _storage._protocol != nil}
  /// Clears the value of ``protocol``. Subsequent reads from it will return its default value.
  mutating func clearProtocol() {_uniqueStorage()._protocol = nil}

  /// upgrade_plan ...
  var upgradePlan: Kyve_Pool_V1beta1_UpgradePlan {
    get {return _storage._upgradePlan ?? Kyve_Pool_V1beta1_UpgradePlan()}
    set {_uniqueStorage()._upgradePlan = newValue}
  }
  /// Returns true if `upgradePlan` has been explicitly set.
  var hasUpgradePlan: Bool {return _storage._upgradePlan != nil}
  /// Clears the value of `upgradePlan`. Subsequent reads from it will return its default value.
  mutating func clearUpgradePlan() {_uniqueStorage()._upgradePlan = nil}

  /// storage_provider_id ...
  var currentStorageProviderID: UInt32 {
    get {return _storage._currentStorageProviderID}
    set {_uniqueStorage()._currentStorageProviderID = newValue}
  }

  /// compression_id ...
  var currentCompressionID: UInt32 {
    get {return _storage._currentCompressionID}
    set {_uniqueStorage()._currentCompressionID = newValue}
  }

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Kyve_Pool_V1beta1_PoolStatus: @unchecked Sendable {}
extension Kyve_Pool_V1beta1_Protocol: @unchecked Sendable {}
extension Kyve_Pool_V1beta1_UpgradePlan: @unchecked Sendable {}
extension Kyve_Pool_V1beta1_Funder: @unchecked Sendable {}
extension Kyve_Pool_V1beta1_Pool: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "kyve.pool.v1beta1"

extension Kyve_Pool_V1beta1_PoolStatus: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "POOL_STATUS_UNSPECIFIED"),
    1: .same(proto: "POOL_STATUS_ACTIVE"),
    2: .same(proto: "POOL_STATUS_DISABLED"),
    3: .same(proto: "POOL_STATUS_NO_FUNDS"),
    4: .same(proto: "POOL_STATUS_NOT_ENOUGH_DELEGATION"),
    5: .same(proto: "POOL_STATUS_UPGRADING"),
  ]
}

extension Kyve_Pool_V1beta1_Protocol: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Protocol"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "version"),
    2: .same(proto: "binaries"),
    3: .standard(proto: "last_upgrade"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.version) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.binaries) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.lastUpgrade) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.version.isEmpty {
      try visitor.visitSingularStringField(value: self.version, fieldNumber: 1)
    }
    if !self.binaries.isEmpty {
      try visitor.visitSingularStringField(value: self.binaries, fieldNumber: 2)
    }
    if self.lastUpgrade != 0 {
      try visitor.visitSingularUInt64Field(value: self.lastUpgrade, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Pool_V1beta1_Protocol, rhs: Kyve_Pool_V1beta1_Protocol) -> Bool {
    if lhs.version != rhs.version {return false}
    if lhs.binaries != rhs.binaries {return false}
    if lhs.lastUpgrade != rhs.lastUpgrade {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Pool_V1beta1_UpgradePlan: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".UpgradePlan"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "version"),
    2: .same(proto: "binaries"),
    3: .standard(proto: "scheduled_at"),
    4: .same(proto: "duration"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.version) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.binaries) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.scheduledAt) }()
      case 4: try { try decoder.decodeSingularUInt64Field(value: &self.duration) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.version.isEmpty {
      try visitor.visitSingularStringField(value: self.version, fieldNumber: 1)
    }
    if !self.binaries.isEmpty {
      try visitor.visitSingularStringField(value: self.binaries, fieldNumber: 2)
    }
    if self.scheduledAt != 0 {
      try visitor.visitSingularUInt64Field(value: self.scheduledAt, fieldNumber: 3)
    }
    if self.duration != 0 {
      try visitor.visitSingularUInt64Field(value: self.duration, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Pool_V1beta1_UpgradePlan, rhs: Kyve_Pool_V1beta1_UpgradePlan) -> Bool {
    if lhs.version != rhs.version {return false}
    if lhs.binaries != rhs.binaries {return false}
    if lhs.scheduledAt != rhs.scheduledAt {return false}
    if lhs.duration != rhs.duration {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Pool_V1beta1_Funder: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Funder"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "address"),
    2: .same(proto: "amount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.address) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.amount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.address.isEmpty {
      try visitor.visitSingularStringField(value: self.address, fieldNumber: 1)
    }
    if self.amount != 0 {
      try visitor.visitSingularUInt64Field(value: self.amount, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Pool_V1beta1_Funder, rhs: Kyve_Pool_V1beta1_Funder) -> Bool {
    if lhs.address != rhs.address {return false}
    if lhs.amount != rhs.amount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Pool_V1beta1_Pool: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Pool"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "name"),
    3: .same(proto: "runtime"),
    4: .same(proto: "logo"),
    5: .same(proto: "config"),
    6: .standard(proto: "start_key"),
    7: .standard(proto: "current_key"),
    8: .standard(proto: "current_summary"),
    9: .standard(proto: "current_index"),
    10: .standard(proto: "total_bundles"),
    11: .standard(proto: "upload_interval"),
    12: .standard(proto: "operating_cost"),
    13: .standard(proto: "min_delegation"),
    14: .standard(proto: "max_bundle_size"),
    15: .same(proto: "disabled"),
    16: .same(proto: "funders"),
    17: .standard(proto: "total_funds"),
    18: .same(proto: "protocol"),
    19: .standard(proto: "upgrade_plan"),
    20: .standard(proto: "current_storage_provider_id"),
    21: .standard(proto: "current_compression_id"),
  ]

  fileprivate class _StorageClass {
    var _id: UInt64 = 0
    var _name: String = String()
    var _runtime: String = String()
    var _logo: String = String()
    var _config: String = String()
    var _startKey: String = String()
    var _currentKey: String = String()
    var _currentSummary: String = String()
    var _currentIndex: UInt64 = 0
    var _totalBundles: UInt64 = 0
    var _uploadInterval: UInt64 = 0
    var _operatingCost: UInt64 = 0
    var _minDelegation: UInt64 = 0
    var _maxBundleSize: UInt64 = 0
    var _disabled: Bool = false
    var _funders: [Kyve_Pool_V1beta1_Funder] = []
    var _totalFunds: UInt64 = 0
    var _protocol: Kyve_Pool_V1beta1_Protocol? = nil
    var _upgradePlan: Kyve_Pool_V1beta1_UpgradePlan? = nil
    var _currentStorageProviderID: UInt32 = 0
    var _currentCompressionID: UInt32 = 0

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _id = source._id
      _name = source._name
      _runtime = source._runtime
      _logo = source._logo
      _config = source._config
      _startKey = source._startKey
      _currentKey = source._currentKey
      _currentSummary = source._currentSummary
      _currentIndex = source._currentIndex
      _totalBundles = source._totalBundles
      _uploadInterval = source._uploadInterval
      _operatingCost = source._operatingCost
      _minDelegation = source._minDelegation
      _maxBundleSize = source._maxBundleSize
      _disabled = source._disabled
      _funders = source._funders
      _totalFunds = source._totalFunds
      _protocol = source._protocol
      _upgradePlan = source._upgradePlan
      _currentStorageProviderID = source._currentStorageProviderID
      _currentCompressionID = source._currentCompressionID
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
        case 1: try { try decoder.decodeSingularUInt64Field(value: &_storage._id) }()
        case 2: try { try decoder.decodeSingularStringField(value: &_storage._name) }()
        case 3: try { try decoder.decodeSingularStringField(value: &_storage._runtime) }()
        case 4: try { try decoder.decodeSingularStringField(value: &_storage._logo) }()
        case 5: try { try decoder.decodeSingularStringField(value: &_storage._config) }()
        case 6: try { try decoder.decodeSingularStringField(value: &_storage._startKey) }()
        case 7: try { try decoder.decodeSingularStringField(value: &_storage._currentKey) }()
        case 8: try { try decoder.decodeSingularStringField(value: &_storage._currentSummary) }()
        case 9: try { try decoder.decodeSingularUInt64Field(value: &_storage._currentIndex) }()
        case 10: try { try decoder.decodeSingularUInt64Field(value: &_storage._totalBundles) }()
        case 11: try { try decoder.decodeSingularUInt64Field(value: &_storage._uploadInterval) }()
        case 12: try { try decoder.decodeSingularUInt64Field(value: &_storage._operatingCost) }()
        case 13: try { try decoder.decodeSingularUInt64Field(value: &_storage._minDelegation) }()
        case 14: try { try decoder.decodeSingularUInt64Field(value: &_storage._maxBundleSize) }()
        case 15: try { try decoder.decodeSingularBoolField(value: &_storage._disabled) }()
        case 16: try { try decoder.decodeRepeatedMessageField(value: &_storage._funders) }()
        case 17: try { try decoder.decodeSingularUInt64Field(value: &_storage._totalFunds) }()
        case 18: try { try decoder.decodeSingularMessageField(value: &_storage._protocol) }()
        case 19: try { try decoder.decodeSingularMessageField(value: &_storage._upgradePlan) }()
        case 20: try { try decoder.decodeSingularUInt32Field(value: &_storage._currentStorageProviderID) }()
        case 21: try { try decoder.decodeSingularUInt32Field(value: &_storage._currentCompressionID) }()
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
      if _storage._id != 0 {
        try visitor.visitSingularUInt64Field(value: _storage._id, fieldNumber: 1)
      }
      if !_storage._name.isEmpty {
        try visitor.visitSingularStringField(value: _storage._name, fieldNumber: 2)
      }
      if !_storage._runtime.isEmpty {
        try visitor.visitSingularStringField(value: _storage._runtime, fieldNumber: 3)
      }
      if !_storage._logo.isEmpty {
        try visitor.visitSingularStringField(value: _storage._logo, fieldNumber: 4)
      }
      if !_storage._config.isEmpty {
        try visitor.visitSingularStringField(value: _storage._config, fieldNumber: 5)
      }
      if !_storage._startKey.isEmpty {
        try visitor.visitSingularStringField(value: _storage._startKey, fieldNumber: 6)
      }
      if !_storage._currentKey.isEmpty {
        try visitor.visitSingularStringField(value: _storage._currentKey, fieldNumber: 7)
      }
      if !_storage._currentSummary.isEmpty {
        try visitor.visitSingularStringField(value: _storage._currentSummary, fieldNumber: 8)
      }
      if _storage._currentIndex != 0 {
        try visitor.visitSingularUInt64Field(value: _storage._currentIndex, fieldNumber: 9)
      }
      if _storage._totalBundles != 0 {
        try visitor.visitSingularUInt64Field(value: _storage._totalBundles, fieldNumber: 10)
      }
      if _storage._uploadInterval != 0 {
        try visitor.visitSingularUInt64Field(value: _storage._uploadInterval, fieldNumber: 11)
      }
      if _storage._operatingCost != 0 {
        try visitor.visitSingularUInt64Field(value: _storage._operatingCost, fieldNumber: 12)
      }
      if _storage._minDelegation != 0 {
        try visitor.visitSingularUInt64Field(value: _storage._minDelegation, fieldNumber: 13)
      }
      if _storage._maxBundleSize != 0 {
        try visitor.visitSingularUInt64Field(value: _storage._maxBundleSize, fieldNumber: 14)
      }
      if _storage._disabled != false {
        try visitor.visitSingularBoolField(value: _storage._disabled, fieldNumber: 15)
      }
      if !_storage._funders.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._funders, fieldNumber: 16)
      }
      if _storage._totalFunds != 0 {
        try visitor.visitSingularUInt64Field(value: _storage._totalFunds, fieldNumber: 17)
      }
      try { if let v = _storage._protocol {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 18)
      } }()
      try { if let v = _storage._upgradePlan {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 19)
      } }()
      if _storage._currentStorageProviderID != 0 {
        try visitor.visitSingularUInt32Field(value: _storage._currentStorageProviderID, fieldNumber: 20)
      }
      if _storage._currentCompressionID != 0 {
        try visitor.visitSingularUInt32Field(value: _storage._currentCompressionID, fieldNumber: 21)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Pool_V1beta1_Pool, rhs: Kyve_Pool_V1beta1_Pool) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._id != rhs_storage._id {return false}
        if _storage._name != rhs_storage._name {return false}
        if _storage._runtime != rhs_storage._runtime {return false}
        if _storage._logo != rhs_storage._logo {return false}
        if _storage._config != rhs_storage._config {return false}
        if _storage._startKey != rhs_storage._startKey {return false}
        if _storage._currentKey != rhs_storage._currentKey {return false}
        if _storage._currentSummary != rhs_storage._currentSummary {return false}
        if _storage._currentIndex != rhs_storage._currentIndex {return false}
        if _storage._totalBundles != rhs_storage._totalBundles {return false}
        if _storage._uploadInterval != rhs_storage._uploadInterval {return false}
        if _storage._operatingCost != rhs_storage._operatingCost {return false}
        if _storage._minDelegation != rhs_storage._minDelegation {return false}
        if _storage._maxBundleSize != rhs_storage._maxBundleSize {return false}
        if _storage._disabled != rhs_storage._disabled {return false}
        if _storage._funders != rhs_storage._funders {return false}
        if _storage._totalFunds != rhs_storage._totalFunds {return false}
        if _storage._protocol != rhs_storage._protocol {return false}
        if _storage._upgradePlan != rhs_storage._upgradePlan {return false}
        if _storage._currentStorageProviderID != rhs_storage._currentStorageProviderID {return false}
        if _storage._currentCompressionID != rhs_storage._currentCompressionID {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
