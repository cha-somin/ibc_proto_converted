// source: umee/incentive/v1/tx.proto
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

goog.provide('proto.umee.incentive.v1.MsgSponsor');

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
proto.umee.incentive.v1.MsgSponsor = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.umee.incentive.v1.MsgSponsor, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.umee.incentive.v1.MsgSponsor.displayName = 'proto.umee.incentive.v1.MsgSponsor';
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
proto.umee.incentive.v1.MsgSponsor.prototype.toObject = function(opt_includeInstance) {
  return proto.umee.incentive.v1.MsgSponsor.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.umee.incentive.v1.MsgSponsor} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.umee.incentive.v1.MsgSponsor.toObject = function(includeInstance, msg) {
  var f, obj = {
    sponsor: jspb.Message.getFieldWithDefault(msg, 1, ""),
    program: jspb.Message.getFieldWithDefault(msg, 2, 0)
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
 * @return {!proto.umee.incentive.v1.MsgSponsor}
 */
proto.umee.incentive.v1.MsgSponsor.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.umee.incentive.v1.MsgSponsor;
  return proto.umee.incentive.v1.MsgSponsor.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.umee.incentive.v1.MsgSponsor} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.umee.incentive.v1.MsgSponsor}
 */
proto.umee.incentive.v1.MsgSponsor.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setSponsor(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setProgram(value);
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
proto.umee.incentive.v1.MsgSponsor.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.umee.incentive.v1.MsgSponsor.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.umee.incentive.v1.MsgSponsor} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.umee.incentive.v1.MsgSponsor.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSponsor();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getProgram();
  if (f !== 0) {
    writer.writeUint32(
      2,
      f
    );
  }
};


/**
 * optional string sponsor = 1;
 * @return {string}
 */
proto.umee.incentive.v1.MsgSponsor.prototype.getSponsor = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.umee.incentive.v1.MsgSponsor} returns this
 */
proto.umee.incentive.v1.MsgSponsor.prototype.setSponsor = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional uint32 program = 2;
 * @return {number}
 */
proto.umee.incentive.v1.MsgSponsor.prototype.getProgram = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.umee.incentive.v1.MsgSponsor} returns this
 */
proto.umee.incentive.v1.MsgSponsor.prototype.setProgram = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


