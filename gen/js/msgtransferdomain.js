// source: iov/starname/v1beta1/tx.proto
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

goog.provide('proto.starnamed.x.starname.v1beta1.MsgTransferDomain');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

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
proto.starnamed.x.starname.v1beta1.MsgTransferDomain = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.starnamed.x.starname.v1beta1.MsgTransferDomain, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.starnamed.x.starname.v1beta1.MsgTransferDomain.displayName = 'proto.starnamed.x.starname.v1beta1.MsgTransferDomain';
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
proto.starnamed.x.starname.v1beta1.MsgTransferDomain.prototype.toObject = function(opt_includeInstance) {
  return proto.starnamed.x.starname.v1beta1.MsgTransferDomain.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.starnamed.x.starname.v1beta1.MsgTransferDomain} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.starnamed.x.starname.v1beta1.MsgTransferDomain.toObject = function(includeInstance, msg) {
  var f, obj = {
    domain: jspb.Message.getFieldWithDefault(msg, 1, ""),
    owner: jspb.Message.getFieldWithDefault(msg, 2, ""),
    payer: jspb.Message.getFieldWithDefault(msg, 3, ""),
    newAdmin: jspb.Message.getFieldWithDefault(msg, 4, ""),
    transferFlag: jspb.Message.getFieldWithDefault(msg, 5, 0)
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
 * @return {!proto.starnamed.x.starname.v1beta1.MsgTransferDomain}
 */
proto.starnamed.x.starname.v1beta1.MsgTransferDomain.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.starnamed.x.starname.v1beta1.MsgTransferDomain;
  return proto.starnamed.x.starname.v1beta1.MsgTransferDomain.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.starnamed.x.starname.v1beta1.MsgTransferDomain} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.starnamed.x.starname.v1beta1.MsgTransferDomain}
 */
proto.starnamed.x.starname.v1beta1.MsgTransferDomain.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setDomain(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setOwner(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setPayer(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setNewAdmin(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setTransferFlag(value);
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
proto.starnamed.x.starname.v1beta1.MsgTransferDomain.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.starnamed.x.starname.v1beta1.MsgTransferDomain.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.starnamed.x.starname.v1beta1.MsgTransferDomain} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.starnamed.x.starname.v1beta1.MsgTransferDomain.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDomain();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getOwner();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getPayer();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getNewAdmin();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getTransferFlag();
  if (f !== 0) {
    writer.writeInt64(
      5,
      f
    );
  }
};


/**
 * optional string domain = 1;
 * @return {string}
 */
proto.starnamed.x.starname.v1beta1.MsgTransferDomain.prototype.getDomain = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.starname.v1beta1.MsgTransferDomain} returns this
 */
proto.starnamed.x.starname.v1beta1.MsgTransferDomain.prototype.setDomain = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string owner = 2;
 * @return {string}
 */
proto.starnamed.x.starname.v1beta1.MsgTransferDomain.prototype.getOwner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.starname.v1beta1.MsgTransferDomain} returns this
 */
proto.starnamed.x.starname.v1beta1.MsgTransferDomain.prototype.setOwner = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string payer = 3;
 * @return {string}
 */
proto.starnamed.x.starname.v1beta1.MsgTransferDomain.prototype.getPayer = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.starname.v1beta1.MsgTransferDomain} returns this
 */
proto.starnamed.x.starname.v1beta1.MsgTransferDomain.prototype.setPayer = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string new_admin = 4;
 * @return {string}
 */
proto.starnamed.x.starname.v1beta1.MsgTransferDomain.prototype.getNewAdmin = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.starname.v1beta1.MsgTransferDomain} returns this
 */
proto.starnamed.x.starname.v1beta1.MsgTransferDomain.prototype.setNewAdmin = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional int64 transfer_flag = 5;
 * @return {number}
 */
proto.starnamed.x.starname.v1beta1.MsgTransferDomain.prototype.getTransferFlag = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.starnamed.x.starname.v1beta1.MsgTransferDomain} returns this
 */
proto.starnamed.x.starname.v1beta1.MsgTransferDomain.prototype.setTransferFlag = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


