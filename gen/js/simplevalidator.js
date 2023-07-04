// source: tendermint/types/validator.proto
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

goog.provide('proto.tendermint.types.SimpleValidator');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.tendermint.crypto.PublicKey');

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
proto.tendermint.types.SimpleValidator = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.tendermint.types.SimpleValidator, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.tendermint.types.SimpleValidator.displayName = 'proto.tendermint.types.SimpleValidator';
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
proto.tendermint.types.SimpleValidator.prototype.toObject = function(opt_includeInstance) {
  return proto.tendermint.types.SimpleValidator.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.tendermint.types.SimpleValidator} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tendermint.types.SimpleValidator.toObject = function(includeInstance, msg) {
  var f, obj = {
    pubKey: (f = msg.getPubKey()) && proto.tendermint.crypto.PublicKey.toObject(includeInstance, f),
    votingPower: jspb.Message.getFieldWithDefault(msg, 2, 0)
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
 * @return {!proto.tendermint.types.SimpleValidator}
 */
proto.tendermint.types.SimpleValidator.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.tendermint.types.SimpleValidator;
  return proto.tendermint.types.SimpleValidator.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.tendermint.types.SimpleValidator} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.tendermint.types.SimpleValidator}
 */
proto.tendermint.types.SimpleValidator.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.tendermint.crypto.PublicKey;
      reader.readMessage(value,proto.tendermint.crypto.PublicKey.deserializeBinaryFromReader);
      msg.setPubKey(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setVotingPower(value);
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
proto.tendermint.types.SimpleValidator.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.tendermint.types.SimpleValidator.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.tendermint.types.SimpleValidator} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tendermint.types.SimpleValidator.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPubKey();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.tendermint.crypto.PublicKey.serializeBinaryToWriter
    );
  }
  f = message.getVotingPower();
  if (f !== 0) {
    writer.writeInt64(
      2,
      f
    );
  }
};


/**
 * optional tendermint.crypto.PublicKey pub_key = 1;
 * @return {?proto.tendermint.crypto.PublicKey}
 */
proto.tendermint.types.SimpleValidator.prototype.getPubKey = function() {
  return /** @type{?proto.tendermint.crypto.PublicKey} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.crypto.PublicKey, 1));
};


/**
 * @param {?proto.tendermint.crypto.PublicKey|undefined} value
 * @return {!proto.tendermint.types.SimpleValidator} returns this
*/
proto.tendermint.types.SimpleValidator.prototype.setPubKey = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.types.SimpleValidator} returns this
 */
proto.tendermint.types.SimpleValidator.prototype.clearPubKey = function() {
  return this.setPubKey(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.types.SimpleValidator.prototype.hasPubKey = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional int64 voting_power = 2;
 * @return {number}
 */
proto.tendermint.types.SimpleValidator.prototype.getVotingPower = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.tendermint.types.SimpleValidator} returns this
 */
proto.tendermint.types.SimpleValidator.prototype.setVotingPower = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};

