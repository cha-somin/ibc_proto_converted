// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: canto/inflation/v1/genesis.proto
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

/// GenesisState defines the inflation module's genesis state.
struct Canto_Inflation_V1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// params defines all the paramaters of the module.
  var params: Canto_Inflation_V1_Params {
    get {return _params ?? Canto_Inflation_V1_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  /// amount of past periods, based on the epochs per period param
  var period: UInt64 = 0

  /// inflation epoch identifier
  var epochIdentifier: String = String()

  /// number of epochs after which inflation is recalculated
  var epochsPerPeriod: Int64 = 0

  /// number of epochs that have passed while inflation is disabled
  var skippedEpochs: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Canto_Inflation_V1_Params? = nil
}

/// Params holds parameters for the inflation module.
struct Canto_Inflation_V1_Params {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// type of coin to mint
  var mintDenom: String = String()

  /// variables to calculate exponential inflation
  var exponentialCalculation: Canto_Inflation_V1_ExponentialCalculation {
    get {return _exponentialCalculation ?? Canto_Inflation_V1_ExponentialCalculation()}
    set {_exponentialCalculation = newValue}
  }
  /// Returns true if `exponentialCalculation` has been explicitly set.
  var hasExponentialCalculation: Bool {return self._exponentialCalculation != nil}
  /// Clears the value of `exponentialCalculation`. Subsequent reads from it will return its default value.
  mutating func clearExponentialCalculation() {self._exponentialCalculation = nil}

  /// inflation distribution of the minted denom
  var inflationDistribution: Canto_Inflation_V1_InflationDistribution {
    get {return _inflationDistribution ?? Canto_Inflation_V1_InflationDistribution()}
    set {_inflationDistribution = newValue}
  }
  /// Returns true if `inflationDistribution` has been explicitly set.
  var hasInflationDistribution: Bool {return self._inflationDistribution != nil}
  /// Clears the value of `inflationDistribution`. Subsequent reads from it will return its default value.
  mutating func clearInflationDistribution() {self._inflationDistribution = nil}

  /// parameter to enable inflation and halt increasing the skipped_epochs
  var enableInflation: Bool = false

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _exponentialCalculation: Canto_Inflation_V1_ExponentialCalculation? = nil
  fileprivate var _inflationDistribution: Canto_Inflation_V1_InflationDistribution? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Canto_Inflation_V1_GenesisState: @unchecked Sendable {}
extension Canto_Inflation_V1_Params: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "canto.inflation.v1"

extension Canto_Inflation_V1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "params"),
    2: .same(proto: "period"),
    3: .standard(proto: "epoch_identifier"),
    4: .standard(proto: "epochs_per_period"),
    5: .standard(proto: "skipped_epochs"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.period) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.epochIdentifier) }()
      case 4: try { try decoder.decodeSingularInt64Field(value: &self.epochsPerPeriod) }()
      case 5: try { try decoder.decodeSingularUInt64Field(value: &self.skippedEpochs) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._params {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if self.period != 0 {
      try visitor.visitSingularUInt64Field(value: self.period, fieldNumber: 2)
    }
    if !self.epochIdentifier.isEmpty {
      try visitor.visitSingularStringField(value: self.epochIdentifier, fieldNumber: 3)
    }
    if self.epochsPerPeriod != 0 {
      try visitor.visitSingularInt64Field(value: self.epochsPerPeriod, fieldNumber: 4)
    }
    if self.skippedEpochs != 0 {
      try visitor.visitSingularUInt64Field(value: self.skippedEpochs, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Canto_Inflation_V1_GenesisState, rhs: Canto_Inflation_V1_GenesisState) -> Bool {
    if lhs._params != rhs._params {return false}
    if lhs.period != rhs.period {return false}
    if lhs.epochIdentifier != rhs.epochIdentifier {return false}
    if lhs.epochsPerPeriod != rhs.epochsPerPeriod {return false}
    if lhs.skippedEpochs != rhs.skippedEpochs {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Canto_Inflation_V1_Params: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Params"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "mint_denom"),
    2: .standard(proto: "exponential_calculation"),
    3: .standard(proto: "inflation_distribution"),
    4: .standard(proto: "enable_inflation"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.mintDenom) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._exponentialCalculation) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._inflationDistribution) }()
      case 4: try { try decoder.decodeSingularBoolField(value: &self.enableInflation) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.mintDenom.isEmpty {
      try visitor.visitSingularStringField(value: self.mintDenom, fieldNumber: 1)
    }
    try { if let v = self._exponentialCalculation {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try { if let v = self._inflationDistribution {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    if self.enableInflation != false {
      try visitor.visitSingularBoolField(value: self.enableInflation, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Canto_Inflation_V1_Params, rhs: Canto_Inflation_V1_Params) -> Bool {
    if lhs.mintDenom != rhs.mintDenom {return false}
    if lhs._exponentialCalculation != rhs._exponentialCalculation {return false}
    if lhs._inflationDistribution != rhs._inflationDistribution {return false}
    if lhs.enableInflation != rhs.enableInflation {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
