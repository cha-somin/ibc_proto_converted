// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: lum-network/beam/genesis.proto
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

/// GenesisState defines the capability module's genesis state.
struct Lum_Network_Beam_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var moduleAccountBalance: Cosmos_Base_V1beta1_Coin {
    get {return _moduleAccountBalance ?? Cosmos_Base_V1beta1_Coin()}
    set {_moduleAccountBalance = newValue}
  }
  /// Returns true if `moduleAccountBalance` has been explicitly set.
  var hasModuleAccountBalance: Bool {return self._moduleAccountBalance != nil}
  /// Clears the value of `moduleAccountBalance`. Subsequent reads from it will return its default value.
  mutating func clearModuleAccountBalance() {self._moduleAccountBalance = nil}

  var beams: [Lum_Network_Beam_Beam] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _moduleAccountBalance: Cosmos_Base_V1beta1_Coin? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Lum_Network_Beam_GenesisState: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "lum.network.beam"

extension Lum_Network_Beam_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "module_account_balance"),
    2: .same(proto: "beams"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._moduleAccountBalance) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.beams) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._moduleAccountBalance {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if !self.beams.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.beams, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Lum_Network_Beam_GenesisState, rhs: Lum_Network_Beam_GenesisState) -> Bool {
    if lhs._moduleAccountBalance != rhs._moduleAccountBalance {return false}
    if lhs.beams != rhs.beams {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
