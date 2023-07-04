// source: axelar/nexus/v1beta1/types.proto
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

goog.provide('proto.axelar.nexus.v1beta1.LinkedAddresses');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.axelar.nexus.exported.v1beta1.CrossChainAddress');

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
proto.axelar.nexus.v1beta1.LinkedAddresses = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.axelar.nexus.v1beta1.LinkedAddresses, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.nexus.v1beta1.LinkedAddresses.displayName = 'proto.axelar.nexus.v1beta1.LinkedAddresses';
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
proto.axelar.nexus.v1beta1.LinkedAddresses.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.nexus.v1beta1.LinkedAddresses.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.nexus.v1beta1.LinkedAddresses} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.nexus.v1beta1.LinkedAddresses.toObject = function(includeInstance, msg) {
  var f, obj = {
    depositAddress: (f = msg.getDepositAddress()) && proto.axelar.nexus.exported.v1beta1.CrossChainAddress.toObject(includeInstance, f),
    recipientAddress: (f = msg.getRecipientAddress()) && proto.axelar.nexus.exported.v1beta1.CrossChainAddress.toObject(includeInstance, f)
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
 * @return {!proto.axelar.nexus.v1beta1.LinkedAddresses}
 */
proto.axelar.nexus.v1beta1.LinkedAddresses.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.nexus.v1beta1.LinkedAddresses;
  return proto.axelar.nexus.v1beta1.LinkedAddresses.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.nexus.v1beta1.LinkedAddresses} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.nexus.v1beta1.LinkedAddresses}
 */
proto.axelar.nexus.v1beta1.LinkedAddresses.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.axelar.nexus.exported.v1beta1.CrossChainAddress;
      reader.readMessage(value,proto.axelar.nexus.exported.v1beta1.CrossChainAddress.deserializeBinaryFromReader);
      msg.setDepositAddress(value);
      break;
    case 2:
      var value = new proto.axelar.nexus.exported.v1beta1.CrossChainAddress;
      reader.readMessage(value,proto.axelar.nexus.exported.v1beta1.CrossChainAddress.deserializeBinaryFromReader);
      msg.setRecipientAddress(value);
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
proto.axelar.nexus.v1beta1.LinkedAddresses.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.nexus.v1beta1.LinkedAddresses.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.nexus.v1beta1.LinkedAddresses} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.nexus.v1beta1.LinkedAddresses.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDepositAddress();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.axelar.nexus.exported.v1beta1.CrossChainAddress.serializeBinaryToWriter
    );
  }
  f = message.getRecipientAddress();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.axelar.nexus.exported.v1beta1.CrossChainAddress.serializeBinaryToWriter
    );
  }
};


/**
 * optional axelar.nexus.exported.v1beta1.CrossChainAddress deposit_address = 1;
 * @return {?proto.axelar.nexus.exported.v1beta1.CrossChainAddress}
 */
proto.axelar.nexus.v1beta1.LinkedAddresses.prototype.getDepositAddress = function() {
  return /** @type{?proto.axelar.nexus.exported.v1beta1.CrossChainAddress} */ (
    jspb.Message.getWrapperField(this, proto.axelar.nexus.exported.v1beta1.CrossChainAddress, 1));
};


/**
 * @param {?proto.axelar.nexus.exported.v1beta1.CrossChainAddress|undefined} value
 * @return {!proto.axelar.nexus.v1beta1.LinkedAddresses} returns this
*/
proto.axelar.nexus.v1beta1.LinkedAddresses.prototype.setDepositAddress = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.nexus.v1beta1.LinkedAddresses} returns this
 */
proto.axelar.nexus.v1beta1.LinkedAddresses.prototype.clearDepositAddress = function() {
  return this.setDepositAddress(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.nexus.v1beta1.LinkedAddresses.prototype.hasDepositAddress = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional axelar.nexus.exported.v1beta1.CrossChainAddress recipient_address = 2;
 * @return {?proto.axelar.nexus.exported.v1beta1.CrossChainAddress}
 */
proto.axelar.nexus.v1beta1.LinkedAddresses.prototype.getRecipientAddress = function() {
  return /** @type{?proto.axelar.nexus.exported.v1beta1.CrossChainAddress} */ (
    jspb.Message.getWrapperField(this, proto.axelar.nexus.exported.v1beta1.CrossChainAddress, 2));
};


/**
 * @param {?proto.axelar.nexus.exported.v1beta1.CrossChainAddress|undefined} value
 * @return {!proto.axelar.nexus.v1beta1.LinkedAddresses} returns this
*/
proto.axelar.nexus.v1beta1.LinkedAddresses.prototype.setRecipientAddress = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.nexus.v1beta1.LinkedAddresses} returns this
 */
proto.axelar.nexus.v1beta1.LinkedAddresses.prototype.clearRecipientAddress = function() {
  return this.setRecipientAddress(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.nexus.v1beta1.LinkedAddresses.prototype.hasRecipientAddress = function() {
  return jspb.Message.getField(this, 2) != null;
};

