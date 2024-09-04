// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: osmosis/gamm/v1beta1/balancerPool.proto
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

/// Parameters for changing the weights in a balancer pool smoothly from
/// a start weight and end weight over a period of time.
/// Currently, the only smooth change supported is linear changing between
/// the two weights, but more types may be added in the future.
/// When these parameters are set, the weight w(t) for pool time `t` is the
/// following:
///   t <= start_time: w(t) = initial_pool_weights
///   start_time < t <= start_time + duration:
///     w(t) = initial_pool_weights + (t - start_time) *
///       (target_pool_weights - initial_pool_weights) / (duration)
///   t > start_time + duration: w(t) = target_pool_weights
struct Osmosis_Gamm_V1beta1_SmoothWeightChangeParams {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// The start time for beginning the weight change.
  /// If a parameter change / pool instantiation leaves this blank,
  /// it should be generated by the state_machine as the current time.
  var startTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _startTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_startTime = newValue}
  }
  /// Returns true if `startTime` has been explicitly set.
  var hasStartTime: Bool {return self._startTime != nil}
  /// Clears the value of `startTime`. Subsequent reads from it will return its default value.
  mutating func clearStartTime() {self._startTime = nil}

  /// Duration for the weights to change over
  var duration: SwiftProtobuf.Google_Protobuf_Duration {
    get {return _duration ?? SwiftProtobuf.Google_Protobuf_Duration()}
    set {_duration = newValue}
  }
  /// Returns true if `duration` has been explicitly set.
  var hasDuration: Bool {return self._duration != nil}
  /// Clears the value of `duration`. Subsequent reads from it will return its default value.
  mutating func clearDuration() {self._duration = nil}

  /// The initial pool weights. These are copied from the pool's settings
  /// at the time of weight change instantiation.
  /// The amount PoolAsset.token.amount field is ignored if present,
  /// future type refactorings should just have a type with the denom & weight
  /// here.
  var initialPoolWeights: [Osmosis_Gamm_V1beta1_PoolAsset] = []

  /// The target pool weights. The pool weights will change linearly with respect
  /// to time between start_time, and start_time + duration. The amount
  /// PoolAsset.token.amount field is ignored if present, future type
  /// refactorings should just have a type with the denom & weight here.
  var targetPoolWeights: [Osmosis_Gamm_V1beta1_PoolAsset] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _startTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
  fileprivate var _duration: SwiftProtobuf.Google_Protobuf_Duration? = nil
}

/// PoolParams defined the parameters that will be managed by the pool
/// governance in the future. This params are not managed by the chain
/// governance. Instead they will be managed by the token holders of the pool.
/// The pool's token holders are specified in future_pool_governor.
struct Osmosis_Gamm_V1beta1_PoolParams {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var swapFee: String = String()

  /// N.B.: exit fee is disabled during pool creation in x/poolmanager. While old
  /// pools can maintain a non-zero fee. No new pool can be created with non-zero
  /// fee anymore
  var exitFee: String = String()

  var smoothWeightChangeParams: Osmosis_Gamm_V1beta1_SmoothWeightChangeParams {
    get {return _smoothWeightChangeParams ?? Osmosis_Gamm_V1beta1_SmoothWeightChangeParams()}
    set {_smoothWeightChangeParams = newValue}
  }
  /// Returns true if `smoothWeightChangeParams` has been explicitly set.
  var hasSmoothWeightChangeParams: Bool {return self._smoothWeightChangeParams != nil}
  /// Clears the value of `smoothWeightChangeParams`. Subsequent reads from it will return its default value.
  mutating func clearSmoothWeightChangeParams() {self._smoothWeightChangeParams = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _smoothWeightChangeParams: Osmosis_Gamm_V1beta1_SmoothWeightChangeParams? = nil
}

/// Pool asset is an internal struct that combines the amount of the
/// token in the pool, and its balancer weight.
/// This is an awkward packaging of data,
/// and should be revisited in a future state migration.
struct Osmosis_Gamm_V1beta1_PoolAsset {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Coins we are talking about,
  /// the denomination must be unique amongst all PoolAssets for this pool.
  var token: Cosmos_Base_V1beta1_Coin {
    get {return _token ?? Cosmos_Base_V1beta1_Coin()}
    set {_token = newValue}
  }
  /// Returns true if `token` has been explicitly set.
  var hasToken: Bool {return self._token != nil}
  /// Clears the value of `token`. Subsequent reads from it will return its default value.
  mutating func clearToken() {self._token = nil}

  /// Weight that is not normalized. This weight must be less than 2^50
  var weight: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _token: Cosmos_Base_V1beta1_Coin? = nil
}

struct Osmosis_Gamm_V1beta1_Pool {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var address: String = String()

  var id: UInt64 = 0

  var poolParams: Osmosis_Gamm_V1beta1_PoolParams {
    get {return _poolParams ?? Osmosis_Gamm_V1beta1_PoolParams()}
    set {_poolParams = newValue}
  }
  /// Returns true if `poolParams` has been explicitly set.
  var hasPoolParams: Bool {return self._poolParams != nil}
  /// Clears the value of `poolParams`. Subsequent reads from it will return its default value.
  mutating func clearPoolParams() {self._poolParams = nil}

  /// This string specifies who will govern the pool in the future.
  /// Valid forms of this are:
  /// {token name},{duration}
  /// {duration}
  /// where {token name} if specified is the token which determines the
  /// governor, and if not specified is the LP token for this pool.duration is
  /// a time specified as 0w,1w,2w, etc. which specifies how long the token
  /// would need to be locked up to count in governance. 0w means no lockup.
  /// TODO: Further improve these docs
  var futurePoolGovernor: String = String()

  /// sum of all LP tokens sent out
  var totalShares: Cosmos_Base_V1beta1_Coin {
    get {return _totalShares ?? Cosmos_Base_V1beta1_Coin()}
    set {_totalShares = newValue}
  }
  /// Returns true if `totalShares` has been explicitly set.
  var hasTotalShares: Bool {return self._totalShares != nil}
  /// Clears the value of `totalShares`. Subsequent reads from it will return its default value.
  mutating func clearTotalShares() {self._totalShares = nil}

  /// These are assumed to be sorted by denomiation.
  /// They contain the pool asset and the information about the weight
  var poolAssets: [Osmosis_Gamm_V1beta1_PoolAsset] = []

  /// sum of all non-normalized pool weights
  var totalWeight: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _poolParams: Osmosis_Gamm_V1beta1_PoolParams? = nil
  fileprivate var _totalShares: Cosmos_Base_V1beta1_Coin? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Osmosis_Gamm_V1beta1_SmoothWeightChangeParams: @unchecked Sendable {}
extension Osmosis_Gamm_V1beta1_PoolParams: @unchecked Sendable {}
extension Osmosis_Gamm_V1beta1_PoolAsset: @unchecked Sendable {}
extension Osmosis_Gamm_V1beta1_Pool: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "osmosis.gamm.v1beta1"

extension Osmosis_Gamm_V1beta1_SmoothWeightChangeParams: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SmoothWeightChangeParams"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "start_time"),
    2: .same(proto: "duration"),
    3: .standard(proto: "initial_pool_weights"),
    4: .standard(proto: "target_pool_weights"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._startTime) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._duration) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.initialPoolWeights) }()
      case 4: try { try decoder.decodeRepeatedMessageField(value: &self.targetPoolWeights) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._startTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try { if let v = self._duration {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    if !self.initialPoolWeights.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.initialPoolWeights, fieldNumber: 3)
    }
    if !self.targetPoolWeights.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.targetPoolWeights, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Gamm_V1beta1_SmoothWeightChangeParams, rhs: Osmosis_Gamm_V1beta1_SmoothWeightChangeParams) -> Bool {
    if lhs._startTime != rhs._startTime {return false}
    if lhs._duration != rhs._duration {return false}
    if lhs.initialPoolWeights != rhs.initialPoolWeights {return false}
    if lhs.targetPoolWeights != rhs.targetPoolWeights {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Gamm_V1beta1_PoolParams: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".PoolParams"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "swap_fee"),
    2: .standard(proto: "exit_fee"),
    3: .standard(proto: "smooth_weight_change_params"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.swapFee) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.exitFee) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._smoothWeightChangeParams) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.swapFee.isEmpty {
      try visitor.visitSingularStringField(value: self.swapFee, fieldNumber: 1)
    }
    if !self.exitFee.isEmpty {
      try visitor.visitSingularStringField(value: self.exitFee, fieldNumber: 2)
    }
    try { if let v = self._smoothWeightChangeParams {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Gamm_V1beta1_PoolParams, rhs: Osmosis_Gamm_V1beta1_PoolParams) -> Bool {
    if lhs.swapFee != rhs.swapFee {return false}
    if lhs.exitFee != rhs.exitFee {return false}
    if lhs._smoothWeightChangeParams != rhs._smoothWeightChangeParams {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Gamm_V1beta1_PoolAsset: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".PoolAsset"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "token"),
    2: .same(proto: "weight"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._token) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.weight) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._token {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if !self.weight.isEmpty {
      try visitor.visitSingularStringField(value: self.weight, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Gamm_V1beta1_PoolAsset, rhs: Osmosis_Gamm_V1beta1_PoolAsset) -> Bool {
    if lhs._token != rhs._token {return false}
    if lhs.weight != rhs.weight {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Gamm_V1beta1_Pool: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Pool"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "address"),
    2: .same(proto: "id"),
    3: .standard(proto: "pool_params"),
    4: .standard(proto: "future_pool_governor"),
    5: .standard(proto: "total_shares"),
    6: .standard(proto: "pool_assets"),
    7: .standard(proto: "total_weight"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.address) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._poolParams) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.futurePoolGovernor) }()
      case 5: try { try decoder.decodeSingularMessageField(value: &self._totalShares) }()
      case 6: try { try decoder.decodeRepeatedMessageField(value: &self.poolAssets) }()
      case 7: try { try decoder.decodeSingularStringField(value: &self.totalWeight) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.address.isEmpty {
      try visitor.visitSingularStringField(value: self.address, fieldNumber: 1)
    }
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 2)
    }
    try { if let v = self._poolParams {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    if !self.futurePoolGovernor.isEmpty {
      try visitor.visitSingularStringField(value: self.futurePoolGovernor, fieldNumber: 4)
    }
    try { if let v = self._totalShares {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
    } }()
    if !self.poolAssets.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.poolAssets, fieldNumber: 6)
    }
    if !self.totalWeight.isEmpty {
      try visitor.visitSingularStringField(value: self.totalWeight, fieldNumber: 7)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Gamm_V1beta1_Pool, rhs: Osmosis_Gamm_V1beta1_Pool) -> Bool {
    if lhs.address != rhs.address {return false}
    if lhs.id != rhs.id {return false}
    if lhs._poolParams != rhs._poolParams {return false}
    if lhs.futurePoolGovernor != rhs.futurePoolGovernor {return false}
    if lhs._totalShares != rhs._totalShares {return false}
    if lhs.poolAssets != rhs.poolAssets {return false}
    if lhs.totalWeight != rhs.totalWeight {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
