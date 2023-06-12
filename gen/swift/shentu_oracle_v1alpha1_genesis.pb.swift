// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: shentu/oracle/v1alpha1/genesis.proto
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

struct Shentu_Oracle_V1alpha1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var operators: [Shentu_Oracle_V1alpha1_Operator] = []

  var totalCollateral: [Cosmos_Base_V1beta1_Coin] = []

  var poolParams: Shentu_Oracle_V1alpha1_LockedPoolParams {
    get {return _poolParams ?? Shentu_Oracle_V1alpha1_LockedPoolParams()}
    set {_poolParams = newValue}
  }
  /// Returns true if `poolParams` has been explicitly set.
  var hasPoolParams: Bool {return self._poolParams != nil}
  /// Clears the value of `poolParams`. Subsequent reads from it will return its default value.
  mutating func clearPoolParams() {self._poolParams = nil}

  var taskParams: Shentu_Oracle_V1alpha1_TaskParams {
    get {return _taskParams ?? Shentu_Oracle_V1alpha1_TaskParams()}
    set {_taskParams = newValue}
  }
  /// Returns true if `taskParams` has been explicitly set.
  var hasTaskParams: Bool {return self._taskParams != nil}
  /// Clears the value of `taskParams`. Subsequent reads from it will return its default value.
  mutating func clearTaskParams() {self._taskParams = nil}

  var withdraws: [Shentu_Oracle_V1alpha1_Withdraw] = []

  var tasks: [Shentu_Oracle_V1alpha1_Task] = []

  var txTasks: [Shentu_Oracle_V1alpha1_TxTask] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _poolParams: Shentu_Oracle_V1alpha1_LockedPoolParams? = nil
  fileprivate var _taskParams: Shentu_Oracle_V1alpha1_TaskParams? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Shentu_Oracle_V1alpha1_GenesisState: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "shentu.oracle.v1alpha1"

extension Shentu_Oracle_V1alpha1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "operators"),
    2: .standard(proto: "total_collateral"),
    3: .standard(proto: "pool_params"),
    4: .standard(proto: "task_params"),
    5: .same(proto: "withdraws"),
    6: .same(proto: "tasks"),
    7: .standard(proto: "tx_tasks"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.operators) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.totalCollateral) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._poolParams) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._taskParams) }()
      case 5: try { try decoder.decodeRepeatedMessageField(value: &self.withdraws) }()
      case 6: try { try decoder.decodeRepeatedMessageField(value: &self.tasks) }()
      case 7: try { try decoder.decodeRepeatedMessageField(value: &self.txTasks) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.operators.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.operators, fieldNumber: 1)
    }
    if !self.totalCollateral.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.totalCollateral, fieldNumber: 2)
    }
    try { if let v = self._poolParams {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try { if let v = self._taskParams {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    if !self.withdraws.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.withdraws, fieldNumber: 5)
    }
    if !self.tasks.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.tasks, fieldNumber: 6)
    }
    if !self.txTasks.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.txTasks, fieldNumber: 7)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Oracle_V1alpha1_GenesisState, rhs: Shentu_Oracle_V1alpha1_GenesisState) -> Bool {
    if lhs.operators != rhs.operators {return false}
    if lhs.totalCollateral != rhs.totalCollateral {return false}
    if lhs._poolParams != rhs._poolParams {return false}
    if lhs._taskParams != rhs._taskParams {return false}
    if lhs.withdraws != rhs.withdraws {return false}
    if lhs.tasks != rhs.tasks {return false}
    if lhs.txTasks != rhs.txTasks {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
