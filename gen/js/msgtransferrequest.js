// source: provenance/marker/v1/tx.proto
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

goog.provide('proto.provenance.marker.v1.MsgTransferRequest');

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
proto.provenance.marker.v1.MsgTransferRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.provenance.marker.v1.MsgTransferRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.marker.v1.MsgTransferRequest.displayName = 'proto.provenance.marker.v1.MsgTransferRequest';
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
proto.provenance.marker.v1.MsgTransferRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.marker.v1.MsgTransferRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.marker.v1.MsgTransferRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.marker.v1.MsgTransferRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    amount: (f = msg.getAmount()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    administrator: jspb.Message.getFieldWithDefault(msg, 3, ""),
    fromAddress: jspb.Message.getFieldWithDefault(msg, 4, ""),
    toAddress: jspb.Message.getFieldWithDefault(msg, 5, "")
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
 * @return {!proto.provenance.marker.v1.MsgTransferRequest}
 */
proto.provenance.marker.v1.MsgTransferRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.marker.v1.MsgTransferRequest;
  return proto.provenance.marker.v1.MsgTransferRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.marker.v1.MsgTransferRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.marker.v1.MsgTransferRequest}
 */
proto.provenance.marker.v1.MsgTransferRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setAmount(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setAdministrator(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setFromAddress(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setToAddress(value);
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
proto.provenance.marker.v1.MsgTransferRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.marker.v1.MsgTransferRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.marker.v1.MsgTransferRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.marker.v1.MsgTransferRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAmount();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getAdministrator();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getFromAddress();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getToAddress();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
};


/**
 * optional cosmos.base.v1beta1.Coin amount = 1;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.provenance.marker.v1.MsgTransferRequest.prototype.getAmount = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 1));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.provenance.marker.v1.MsgTransferRequest} returns this
*/
proto.provenance.marker.v1.MsgTransferRequest.prototype.setAmount = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.marker.v1.MsgTransferRequest} returns this
 */
proto.provenance.marker.v1.MsgTransferRequest.prototype.clearAmount = function() {
  return this.setAmount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.marker.v1.MsgTransferRequest.prototype.hasAmount = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional string administrator = 3;
 * @return {string}
 */
proto.provenance.marker.v1.MsgTransferRequest.prototype.getAdministrator = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.marker.v1.MsgTransferRequest} returns this
 */
proto.provenance.marker.v1.MsgTransferRequest.prototype.setAdministrator = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string from_address = 4;
 * @return {string}
 */
proto.provenance.marker.v1.MsgTransferRequest.prototype.getFromAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.marker.v1.MsgTransferRequest} returns this
 */
proto.provenance.marker.v1.MsgTransferRequest.prototype.setFromAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string to_address = 5;
 * @return {string}
 */
proto.provenance.marker.v1.MsgTransferRequest.prototype.getToAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.marker.v1.MsgTransferRequest} returns this
 */
proto.provenance.marker.v1.MsgTransferRequest.prototype.setToAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


