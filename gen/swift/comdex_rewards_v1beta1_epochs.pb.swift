// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: comdex/rewards/v1beta1/epochs.proto
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

struct Comdex_Rewards_V1beta1_EpochInfo {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var startTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _startTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_startTime = newValue}
  }
  /// Returns true if `startTime` has been explicitly set.
  var hasStartTime: Bool {return self._startTime != nil}
  /// Clears the value of `startTime`. Subsequent reads from it will return its default value.
  mutating func clearStartTime() {self._startTime = nil}

  var duration: SwiftProtobuf.Google_Protobuf_Duration {
    get {return _duration ?? SwiftProtobuf.Google_Protobuf_Duration()}
    set {_duration = newValue}
  }
  /// Returns true if `duration` has been explicitly set.
  var hasDuration: Bool {return self._duration != nil}
  /// Clears the value of `duration`. Subsequent reads from it will return its default value.
  mutating func clearDuration() {self._duration = nil}

  var currentEpoch: Int64 = 0

  var currentEpochStartTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _currentEpochStartTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_currentEpochStartTime = newValue}
  }
  /// Returns true if `currentEpochStartTime` has been explicitly set.
  var hasCurrentEpochStartTime: Bool {return self._currentEpochStartTime != nil}
  /// Clears the value of `currentEpochStartTime`. Subsequent reads from it will return its default value.
  mutating func clearCurrentEpochStartTime() {self._currentEpochStartTime = nil}

  var currentEpochStartHeight: Int64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _startTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
  fileprivate var _duration: SwiftProtobuf.Google_Protobuf_Duration? = nil
  fileprivate var _currentEpochStartTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Comdex_Rewards_V1beta1_EpochInfo: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "comdex.rewards.v1beta1"

extension Comdex_Rewards_V1beta1_EpochInfo: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".EpochInfo"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    2: .standard(proto: "start_time"),
    3: .same(proto: "duration"),
    4: .standard(proto: "current_epoch"),
    5: .standard(proto: "current_epoch_start_time"),
    6: .standard(proto: "current_epoch_start_height"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 2: try { try decoder.decodeSingularMessageField(value: &self._startTime) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._duration) }()
      case 4: try { try decoder.decodeSingularInt64Field(value: &self.currentEpoch) }()
      case 5: try { try decoder.decodeSingularMessageField(value: &self._currentEpochStartTime) }()
      case 6: try { try decoder.decodeSingularInt64Field(value: &self.currentEpochStartHeight) }()
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
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try { if let v = self._duration {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    if self.currentEpoch != 0 {
      try visitor.visitSingularInt64Field(value: self.currentEpoch, fieldNumber: 4)
    }
    try { if let v = self._currentEpochStartTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
    } }()
    if self.currentEpochStartHeight != 0 {
      try visitor.visitSingularInt64Field(value: self.currentEpochStartHeight, fieldNumber: 6)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Comdex_Rewards_V1beta1_EpochInfo, rhs: Comdex_Rewards_V1beta1_EpochInfo) -> Bool {
    if lhs._startTime != rhs._startTime {return false}
    if lhs._duration != rhs._duration {return false}
    if lhs.currentEpoch != rhs.currentEpoch {return false}
    if lhs._currentEpochStartTime != rhs._currentEpochStartTime {return false}
    if lhs.currentEpochStartHeight != rhs.currentEpochStartHeight {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
