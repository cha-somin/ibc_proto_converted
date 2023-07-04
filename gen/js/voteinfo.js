// source: tendermint/abci/types.proto
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

goog.provide('proto.tendermint.abci.VoteInfo');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.tendermint.abci.Validator');

goog.forwardDeclare('proto.tendermint.types.BlockIDFlag');
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
proto.tendermint.abci.VoteInfo = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.tendermint.abci.VoteInfo, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.tendermint.abci.VoteInfo.displayName = 'proto.tendermint.abci.VoteInfo';
}



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
proto.tendermint.abci.VoteInfo.prototype.toObject = function(opt_includeInstance) {
  return proto.tendermint.abci.VoteInfo.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.tendermint.abci.VoteInfo} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tendermint.abci.VoteInfo.toObject = function(includeInstance, msg) {
  var f, obj = {
    validator: (f = msg.getValidator()) && proto.tendermint.abci.Validator.toObject(includeInstance, f),
    blockIdFlag: jspb.Message.getFieldWithDefault(msg, 3, 0)
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
 * @return {!proto.tendermint.abci.VoteInfo}
 */
proto.tendermint.abci.VoteInfo.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.tendermint.abci.VoteInfo;
  return proto.tendermint.abci.VoteInfo.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.tendermint.abci.VoteInfo} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.tendermint.abci.VoteInfo}
 */
proto.tendermint.abci.VoteInfo.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.tendermint.abci.Validator;
      reader.readMessage(value,proto.tendermint.abci.Validator.deserializeBinaryFromReader);
      msg.setValidator(value);
      break;
    case 3:
      var value = /** @type {!proto.tendermint.types.BlockIDFlag} */ (reader.readEnum());
      msg.setBlockIdFlag(value);
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
proto.tendermint.abci.VoteInfo.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.tendermint.abci.VoteInfo.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.tendermint.abci.VoteInfo} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tendermint.abci.VoteInfo.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getValidator();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.tendermint.abci.Validator.serializeBinaryToWriter
    );
  }
  f = message.getBlockIdFlag();
  if (f !== 0.0) {
    writer.writeEnum(
      3,
      f
    );
  }
};


/**
 * optional Validator validator = 1;
 * @return {?proto.tendermint.abci.Validator}
 */
proto.tendermint.abci.VoteInfo.prototype.getValidator = function() {
  return /** @type{?proto.tendermint.abci.Validator} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.abci.Validator, 1));
};


/**
 * @param {?proto.tendermint.abci.Validator|undefined} value
 * @return {!proto.tendermint.abci.VoteInfo} returns this
*/
proto.tendermint.abci.VoteInfo.prototype.setValidator = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.abci.VoteInfo} returns this
 */
proto.tendermint.abci.VoteInfo.prototype.clearValidator = function() {
  return this.setValidator(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.abci.VoteInfo.prototype.hasValidator = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional tendermint.types.BlockIDFlag block_id_flag = 3;
 * @return {!proto.tendermint.types.BlockIDFlag}
 */
proto.tendermint.abci.VoteInfo.prototype.getBlockIdFlag = function() {
  return /** @type {!proto.tendermint.types.BlockIDFlag} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {!proto.tendermint.types.BlockIDFlag} value
 * @return {!proto.tendermint.abci.VoteInfo} returns this
 */
proto.tendermint.abci.VoteInfo.prototype.setBlockIdFlag = function(value) {
  return jspb.Message.setProto3EnumField(this, 3, value);
};

