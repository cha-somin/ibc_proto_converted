// source: cosmwasm/wasm/v1/genesis.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {missingRequire} reports error on implicit type usages.
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!
/* eslint-disable */
// @ts-nocheck

goog.provide('proto.cosmwasm.wasm.v1.Contract');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmwasm.wasm.v1.ContractInfo');
goog.require('proto.cosmwasm.wasm.v1.Model');

/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.cosmwasm.wasm.v1.Contract = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmwasm.wasm.v1.Contract.repeatedFields_, null);
};
goog.inherits(proto.cosmwasm.wasm.v1.Contract, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmwasm.wasm.v1.Contract.displayName = 'proto.cosmwasm.wasm.v1.Contract';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmwasm.wasm.v1.Contract.repeatedFields_ = [3];



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.cosmwasm.wasm.v1.Contract.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmwasm.wasm.v1.Contract.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmwasm.wasm.v1.Contract} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmwasm.wasm.v1.Contract.toObject = function(includeInstance, msg) {
  var f, obj = {
    contractAddress: jspb.Message.getFieldWithDefault(msg, 1, ""),
    contractInfo: (f = msg.getContractInfo()) && proto.cosmwasm.wasm.v1.ContractInfo.toObject(includeInstance, f),
    contractStateList: jspb.Message.toObjectList(msg.getContractStateList(),
    proto.cosmwasm.wasm.v1.Model.toObject, includeInstance)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.cosmwasm.wasm.v1.Contract}
 */
proto.cosmwasm.wasm.v1.Contract.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmwasm.wasm.v1.Contract;
  return proto.cosmwasm.wasm.v1.Contract.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmwasm.wasm.v1.Contract} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmwasm.wasm.v1.Contract}
 */
proto.cosmwasm.wasm.v1.Contract.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setContractAddress(value);
      break;
    case 2:
      var value = new proto.cosmwasm.wasm.v1.ContractInfo;
      reader.readMessage(value,proto.cosmwasm.wasm.v1.ContractInfo.deserializeBinaryFromReader);
      msg.setContractInfo(value);
      break;
    case 3:
      var value = new proto.cosmwasm.wasm.v1.Model;
      reader.readMessage(value,proto.cosmwasm.wasm.v1.Model.deserializeBinaryFromReader);
      msg.addContractState(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.cosmwasm.wasm.v1.Contract.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmwasm.wasm.v1.Contract.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmwasm.wasm.v1.Contract} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmwasm.wasm.v1.Contract.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getContractAddress();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getContractInfo();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmwasm.wasm.v1.ContractInfo.serializeBinaryToWriter
    );
  }
  f = message.getContractStateList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.cosmwasm.wasm.v1.Model.serializeBinaryToWriter
    );
  }
};


/**
 * optional string contract_address = 1;
 * @return {string}
 */
proto.cosmwasm.wasm.v1.Contract.prototype.getContractAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmwasm.wasm.v1.Contract} returns this
 */
proto.cosmwasm.wasm.v1.Contract.prototype.setContractAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional ContractInfo contract_info = 2;
 * @return {?proto.cosmwasm.wasm.v1.ContractInfo}
 */
proto.cosmwasm.wasm.v1.Contract.prototype.getContractInfo = function() {
  return /** @type{?proto.cosmwasm.wasm.v1.ContractInfo} */ (
    jspb.Message.getWrapperField(this, proto.cosmwasm.wasm.v1.ContractInfo, 2));
};


/**
 * @param {?proto.cosmwasm.wasm.v1.ContractInfo|undefined} value
 * @return {!proto.cosmwasm.wasm.v1.Contract} returns this
*/
proto.cosmwasm.wasm.v1.Contract.prototype.setContractInfo = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmwasm.wasm.v1.Contract} returns this
 */
proto.cosmwasm.wasm.v1.Contract.prototype.clearContractInfo = function() {
  return this.setContractInfo(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmwasm.wasm.v1.Contract.prototype.hasContractInfo = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * repeated Model contract_state = 3;
 * @return {!Array<!proto.cosmwasm.wasm.v1.Model>}
 */
proto.cosmwasm.wasm.v1.Contract.prototype.getContractStateList = function() {
  return /** @type{!Array<!proto.cosmwasm.wasm.v1.Model>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmwasm.wasm.v1.Model, 3));
};


/**
 * @param {!Array<!proto.cosmwasm.wasm.v1.Model>} value
 * @return {!proto.cosmwasm.wasm.v1.Contract} returns this
*/
proto.cosmwasm.wasm.v1.Contract.prototype.setContractStateList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.cosmwasm.wasm.v1.Model=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmwasm.wasm.v1.Model}
 */
proto.cosmwasm.wasm.v1.Contract.prototype.addContractState = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.cosmwasm.wasm.v1.Model, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmwasm.wasm.v1.Contract} returns this
 */
proto.cosmwasm.wasm.v1.Contract.prototype.clearContractStateList = function() {
  return this.setContractStateList([]);
};


