// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: akash/inflation/v1beta2/params.proto
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

/// Params defines the parameters for the x/deployment package
struct Akash_Inflation_V1beta2_Params {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// InflationDecayFactor is the number of years it takes inflation to halve.
  var inflationDecayFactor: String = String()

  /// InitialInflation is the rate at which inflation starts at genesis.
  /// It is a decimal value in the range [0.0, 100.0].
  var initialInflation: String = String()

  /// Variance defines the fraction by which inflation can vary from ideal inflation in a block.
  /// It is a decimal value in the range [0.0, 1.0].
  var variance: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Akash_Inflation_V1beta2_Params: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "akash.inflation.v1beta2"

extension Akash_Inflation_V1beta2_Params: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Params"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "inflation_decay_factor"),
    2: .standard(proto: "initial_inflation"),
    3: .same(proto: "variance"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.inflationDecayFactor) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.initialInflation) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.variance) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.inflationDecayFactor.isEmpty {
      try visitor.visitSingularStringField(value: self.inflationDecayFactor, fieldNumber: 1)
    }
    if !self.initialInflation.isEmpty {
      try visitor.visitSingularStringField(value: self.initialInflation, fieldNumber: 2)
    }
    if !self.variance.isEmpty {
      try visitor.visitSingularStringField(value: self.variance, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Akash_Inflation_V1beta2_Params, rhs: Akash_Inflation_V1beta2_Params) -> Bool {
    if lhs.inflationDecayFactor != rhs.inflationDecayFactor {return false}
    if lhs.initialInflation != rhs.initialInflation {return false}
    if lhs.variance != rhs.variance {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
