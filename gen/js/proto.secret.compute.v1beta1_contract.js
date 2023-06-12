// source: secret/compute/v1beta1/genesis.proto
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

goog.provide('proto.secret.compute.v1beta1.Contract');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.secret.compute.v1beta1.ContractCustomInfo');
goog.require('proto.secret.compute.v1beta1.ContractInfo');
goog.require('proto.secret.compute.v1beta1.Model');

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
proto.secret.compute.v1beta1.Contract = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.secret.compute.v1beta1.Contract.repeatedFields_, null);
};
goog.inherits(proto.secret.compute.v1beta1.Contract, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.secret.compute.v1beta1.Contract.displayName = 'proto.secret.compute.v1beta1.Contract';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.secret.compute.v1beta1.Contract.repeatedFields_ = [3];



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
proto.secret.compute.v1beta1.Contract.prototype.toObject = function(opt_includeInstance) {
  return proto.secret.compute.v1beta1.Contract.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.secret.compute.v1beta1.Contract} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.secret.compute.v1beta1.Contract.toObject = function(includeInstance, msg) {
  var f, obj = {
    contractAddress: msg.getContractAddress_asB64(),
    contractInfo: (f = msg.getContractInfo()) && proto.secret.compute.v1beta1.ContractInfo.toObject(includeInstance, f),
    contractStateList: jspb.Message.toObjectList(msg.getContractStateList(),
    proto.secret.compute.v1beta1.Model.toObject, includeInstance),
    contractCustomInfo: (f = msg.getContractCustomInfo()) && proto.secret.compute.v1beta1.ContractCustomInfo.toObject(includeInstance, f)
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
 * @return {!proto.secret.compute.v1beta1.Contract}
 */
proto.secret.compute.v1beta1.Contract.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.secret.compute.v1beta1.Contract;
  return proto.secret.compute.v1beta1.Contract.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.secret.compute.v1beta1.Contract} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.secret.compute.v1beta1.Contract}
 */
proto.secret.compute.v1beta1.Contract.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setContractAddress(value);
      break;
    case 2:
      var value = new proto.secret.compute.v1beta1.ContractInfo;
      reader.readMessage(value,proto.secret.compute.v1beta1.ContractInfo.deserializeBinaryFromReader);
      msg.setContractInfo(value);
      break;
    case 3:
      var value = new proto.secret.compute.v1beta1.Model;
      reader.readMessage(value,proto.secret.compute.v1beta1.Model.deserializeBinaryFromReader);
      msg.addContractState(value);
      break;
    case 4:
      var value = new proto.secret.compute.v1beta1.ContractCustomInfo;
      reader.readMessage(value,proto.secret.compute.v1beta1.ContractCustomInfo.deserializeBinaryFromReader);
      msg.setContractCustomInfo(value);
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
proto.secret.compute.v1beta1.Contract.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.secret.compute.v1beta1.Contract.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.secret.compute.v1beta1.Contract} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.secret.compute.v1beta1.Contract.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getContractAddress_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getContractInfo();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.secret.compute.v1beta1.ContractInfo.serializeBinaryToWriter
    );
  }
  f = message.getContractStateList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.secret.compute.v1beta1.Model.serializeBinaryToWriter
    );
  }
  f = message.getContractCustomInfo();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.secret.compute.v1beta1.ContractCustomInfo.serializeBinaryToWriter
    );
  }
};


/**
 * optional bytes contract_address = 1;
 * @return {string}
 */
proto.secret.compute.v1beta1.Contract.prototype.getContractAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes contract_address = 1;
 * This is a type-conversion wrapper around `getContractAddress()`
 * @return {string}
 */
proto.secret.compute.v1beta1.Contract.prototype.getContractAddress_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getContractAddress()));
};


/**
 * optional bytes contract_address = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getContractAddress()`
 * @return {!Uint8Array}
 */
proto.secret.compute.v1beta1.Contract.prototype.getContractAddress_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getContractAddress()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.secret.compute.v1beta1.Contract} returns this
 */
proto.secret.compute.v1beta1.Contract.prototype.setContractAddress = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional ContractInfo contract_info = 2;
 * @return {?proto.secret.compute.v1beta1.ContractInfo}
 */
proto.secret.compute.v1beta1.Contract.prototype.getContractInfo = function() {
  return /** @type{?proto.secret.compute.v1beta1.ContractInfo} */ (
    jspb.Message.getWrapperField(this, proto.secret.compute.v1beta1.ContractInfo, 2));
};


/**
 * @param {?proto.secret.compute.v1beta1.ContractInfo|undefined} value
 * @return {!proto.secret.compute.v1beta1.Contract} returns this
*/
proto.secret.compute.v1beta1.Contract.prototype.setContractInfo = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.secret.compute.v1beta1.Contract} returns this
 */
proto.secret.compute.v1beta1.Contract.prototype.clearContractInfo = function() {
  return this.setContractInfo(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.secret.compute.v1beta1.Contract.prototype.hasContractInfo = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * repeated Model contract_state = 3;
 * @return {!Array<!proto.secret.compute.v1beta1.Model>}
 */
proto.secret.compute.v1beta1.Contract.prototype.getContractStateList = function() {
  return /** @type{!Array<!proto.secret.compute.v1beta1.Model>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.secret.compute.v1beta1.Model, 3));
};


/**
 * @param {!Array<!proto.secret.compute.v1beta1.Model>} value
 * @return {!proto.secret.compute.v1beta1.Contract} returns this
*/
proto.secret.compute.v1beta1.Contract.prototype.setContractStateList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.secret.compute.v1beta1.Model=} opt_value
 * @param {number=} opt_index
 * @return {!proto.secret.compute.v1beta1.Model}
 */
proto.secret.compute.v1beta1.Contract.prototype.addContractState = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.secret.compute.v1beta1.Model, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.secret.compute.v1beta1.Contract} returns this
 */
proto.secret.compute.v1beta1.Contract.prototype.clearContractStateList = function() {
  return this.setContractStateList([]);
};


/**
 * optional ContractCustomInfo contract_custom_info = 4;
 * @return {?proto.secret.compute.v1beta1.ContractCustomInfo}
 */
proto.secret.compute.v1beta1.Contract.prototype.getContractCustomInfo = function() {
  return /** @type{?proto.secret.compute.v1beta1.ContractCustomInfo} */ (
    jspb.Message.getWrapperField(this, proto.secret.compute.v1beta1.ContractCustomInfo, 4));
};


/**
 * @param {?proto.secret.compute.v1beta1.ContractCustomInfo|undefined} value
 * @return {!proto.secret.compute.v1beta1.Contract} returns this
*/
proto.secret.compute.v1beta1.Contract.prototype.setContractCustomInfo = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.secret.compute.v1beta1.Contract} returns this
 */
proto.secret.compute.v1beta1.Contract.prototype.clearContractCustomInfo = function() {
  return this.setContractCustomInfo(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.secret.compute.v1beta1.Contract.prototype.hasContractCustomInfo = function() {
  return jspb.Message.getField(this, 4) != null;
};


