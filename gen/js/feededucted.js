// source: axelar/nexus/v1beta1/events.proto
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

goog.provide('proto.axelar.nexus.v1beta1.FeeDeducted');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');

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
proto.axelar.nexus.v1beta1.FeeDeducted = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.axelar.nexus.v1beta1.FeeDeducted, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.nexus.v1beta1.FeeDeducted.displayName = 'proto.axelar.nexus.v1beta1.FeeDeducted';
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
proto.axelar.nexus.v1beta1.FeeDeducted.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.nexus.v1beta1.FeeDeducted.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.nexus.v1beta1.FeeDeducted} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.nexus.v1beta1.FeeDeducted.toObject = function(includeInstance, msg) {
  var f, obj = {
    transferId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    recipientChain: jspb.Message.getFieldWithDefault(msg, 2, ""),
    recipientAddress: jspb.Message.getFieldWithDefault(msg, 3, ""),
    amount: (f = msg.getAmount()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    fee: (f = msg.getFee()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f)
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
 * @return {!proto.axelar.nexus.v1beta1.FeeDeducted}
 */
proto.axelar.nexus.v1beta1.FeeDeducted.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.nexus.v1beta1.FeeDeducted;
  return proto.axelar.nexus.v1beta1.FeeDeducted.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.nexus.v1beta1.FeeDeducted} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.nexus.v1beta1.FeeDeducted}
 */
proto.axelar.nexus.v1beta1.FeeDeducted.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setTransferId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setRecipientChain(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setRecipientAddress(value);
      break;
    case 4:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setAmount(value);
      break;
    case 5:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setFee(value);
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
proto.axelar.nexus.v1beta1.FeeDeducted.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.nexus.v1beta1.FeeDeducted.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.nexus.v1beta1.FeeDeducted} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.nexus.v1beta1.FeeDeducted.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTransferId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getRecipientChain();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getRecipientAddress();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getAmount();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getFee();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * optional uint64 transfer_id = 1;
 * @return {number}
 */
proto.axelar.nexus.v1beta1.FeeDeducted.prototype.getTransferId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.axelar.nexus.v1beta1.FeeDeducted} returns this
 */
proto.axelar.nexus.v1beta1.FeeDeducted.prototype.setTransferId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string recipient_chain = 2;
 * @return {string}
 */
proto.axelar.nexus.v1beta1.FeeDeducted.prototype.getRecipientChain = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.nexus.v1beta1.FeeDeducted} returns this
 */
proto.axelar.nexus.v1beta1.FeeDeducted.prototype.setRecipientChain = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string recipient_address = 3;
 * @return {string}
 */
proto.axelar.nexus.v1beta1.FeeDeducted.prototype.getRecipientAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.nexus.v1beta1.FeeDeducted} returns this
 */
proto.axelar.nexus.v1beta1.FeeDeducted.prototype.setRecipientAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional cosmos.base.v1beta1.Coin amount = 4;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.axelar.nexus.v1beta1.FeeDeducted.prototype.getAmount = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 4));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.axelar.nexus.v1beta1.FeeDeducted} returns this
*/
proto.axelar.nexus.v1beta1.FeeDeducted.prototype.setAmount = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.nexus.v1beta1.FeeDeducted} returns this
 */
proto.axelar.nexus.v1beta1.FeeDeducted.prototype.clearAmount = function() {
  return this.setAmount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.nexus.v1beta1.FeeDeducted.prototype.hasAmount = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional cosmos.base.v1beta1.Coin fee = 5;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.axelar.nexus.v1beta1.FeeDeducted.prototype.getFee = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 5));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.axelar.nexus.v1beta1.FeeDeducted} returns this
*/
proto.axelar.nexus.v1beta1.FeeDeducted.prototype.setFee = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.nexus.v1beta1.FeeDeducted} returns this
 */
proto.axelar.nexus.v1beta1.FeeDeducted.prototype.clearFee = function() {
  return this.setFee(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.nexus.v1beta1.FeeDeducted.prototype.hasFee = function() {
  return jspb.Message.getField(this, 5) != null;
};


