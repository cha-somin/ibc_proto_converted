// source: provenance/msgfees/v1/proposals.proto
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

goog.provide('proto.provenance.msgfees.v1.UpdateMsgFeeProposal');

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
proto.provenance.msgfees.v1.UpdateMsgFeeProposal = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.provenance.msgfees.v1.UpdateMsgFeeProposal, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.msgfees.v1.UpdateMsgFeeProposal.displayName = 'proto.provenance.msgfees.v1.UpdateMsgFeeProposal';
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
proto.provenance.msgfees.v1.UpdateMsgFeeProposal.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.msgfees.v1.UpdateMsgFeeProposal.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.msgfees.v1.UpdateMsgFeeProposal} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.msgfees.v1.UpdateMsgFeeProposal.toObject = function(includeInstance, msg) {
  var f, obj = {
    title: jspb.Message.getFieldWithDefault(msg, 1, ""),
    description: jspb.Message.getFieldWithDefault(msg, 2, ""),
    msgTypeUrl: jspb.Message.getFieldWithDefault(msg, 3, ""),
    additionalFee: (f = msg.getAdditionalFee()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    recipient: jspb.Message.getFieldWithDefault(msg, 5, ""),
    recipientBasisPoints: jspb.Message.getFieldWithDefault(msg, 6, "")
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
 * @return {!proto.provenance.msgfees.v1.UpdateMsgFeeProposal}
 */
proto.provenance.msgfees.v1.UpdateMsgFeeProposal.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.msgfees.v1.UpdateMsgFeeProposal;
  return proto.provenance.msgfees.v1.UpdateMsgFeeProposal.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.msgfees.v1.UpdateMsgFeeProposal} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.msgfees.v1.UpdateMsgFeeProposal}
 */
proto.provenance.msgfees.v1.UpdateMsgFeeProposal.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setTitle(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDescription(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setMsgTypeUrl(value);
      break;
    case 4:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setAdditionalFee(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setRecipient(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setRecipientBasisPoints(value);
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
proto.provenance.msgfees.v1.UpdateMsgFeeProposal.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.msgfees.v1.UpdateMsgFeeProposal.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.msgfees.v1.UpdateMsgFeeProposal} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.msgfees.v1.UpdateMsgFeeProposal.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTitle();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDescription();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getMsgTypeUrl();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getAdditionalFee();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getRecipient();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getRecipientBasisPoints();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
};


/**
 * optional string title = 1;
 * @return {string}
 */
proto.provenance.msgfees.v1.UpdateMsgFeeProposal.prototype.getTitle = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.msgfees.v1.UpdateMsgFeeProposal} returns this
 */
proto.provenance.msgfees.v1.UpdateMsgFeeProposal.prototype.setTitle = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string description = 2;
 * @return {string}
 */
proto.provenance.msgfees.v1.UpdateMsgFeeProposal.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.msgfees.v1.UpdateMsgFeeProposal} returns this
 */
proto.provenance.msgfees.v1.UpdateMsgFeeProposal.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string msg_type_url = 3;
 * @return {string}
 */
proto.provenance.msgfees.v1.UpdateMsgFeeProposal.prototype.getMsgTypeUrl = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.msgfees.v1.UpdateMsgFeeProposal} returns this
 */
proto.provenance.msgfees.v1.UpdateMsgFeeProposal.prototype.setMsgTypeUrl = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional cosmos.base.v1beta1.Coin additional_fee = 4;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.provenance.msgfees.v1.UpdateMsgFeeProposal.prototype.getAdditionalFee = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 4));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.provenance.msgfees.v1.UpdateMsgFeeProposal} returns this
*/
proto.provenance.msgfees.v1.UpdateMsgFeeProposal.prototype.setAdditionalFee = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.msgfees.v1.UpdateMsgFeeProposal} returns this
 */
proto.provenance.msgfees.v1.UpdateMsgFeeProposal.prototype.clearAdditionalFee = function() {
  return this.setAdditionalFee(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.msgfees.v1.UpdateMsgFeeProposal.prototype.hasAdditionalFee = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional string recipient = 5;
 * @return {string}
 */
proto.provenance.msgfees.v1.UpdateMsgFeeProposal.prototype.getRecipient = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.msgfees.v1.UpdateMsgFeeProposal} returns this
 */
proto.provenance.msgfees.v1.UpdateMsgFeeProposal.prototype.setRecipient = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string recipient_basis_points = 6;
 * @return {string}
 */
proto.provenance.msgfees.v1.UpdateMsgFeeProposal.prototype.getRecipientBasisPoints = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.msgfees.v1.UpdateMsgFeeProposal} returns this
 */
proto.provenance.msgfees.v1.UpdateMsgFeeProposal.prototype.setRecipientBasisPoints = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


