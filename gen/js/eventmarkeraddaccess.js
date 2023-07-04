// source: provenance/marker/v1/marker.proto
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

goog.provide('proto.provenance.marker.v1.EventMarkerAddAccess');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.provenance.marker.v1.EventMarkerAccess');

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
proto.provenance.marker.v1.EventMarkerAddAccess = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.provenance.marker.v1.EventMarkerAddAccess, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.marker.v1.EventMarkerAddAccess.displayName = 'proto.provenance.marker.v1.EventMarkerAddAccess';
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
proto.provenance.marker.v1.EventMarkerAddAccess.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.marker.v1.EventMarkerAddAccess.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.marker.v1.EventMarkerAddAccess} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.marker.v1.EventMarkerAddAccess.toObject = function(includeInstance, msg) {
  var f, obj = {
    access: (f = msg.getAccess()) && proto.provenance.marker.v1.EventMarkerAccess.toObject(includeInstance, f),
    denom: jspb.Message.getFieldWithDefault(msg, 2, ""),
    administrator: jspb.Message.getFieldWithDefault(msg, 3, "")
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
 * @return {!proto.provenance.marker.v1.EventMarkerAddAccess}
 */
proto.provenance.marker.v1.EventMarkerAddAccess.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.marker.v1.EventMarkerAddAccess;
  return proto.provenance.marker.v1.EventMarkerAddAccess.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.marker.v1.EventMarkerAddAccess} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.marker.v1.EventMarkerAddAccess}
 */
proto.provenance.marker.v1.EventMarkerAddAccess.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.provenance.marker.v1.EventMarkerAccess;
      reader.readMessage(value,proto.provenance.marker.v1.EventMarkerAccess.deserializeBinaryFromReader);
      msg.setAccess(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDenom(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setAdministrator(value);
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
proto.provenance.marker.v1.EventMarkerAddAccess.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.marker.v1.EventMarkerAddAccess.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.marker.v1.EventMarkerAddAccess} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.marker.v1.EventMarkerAddAccess.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAccess();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.provenance.marker.v1.EventMarkerAccess.serializeBinaryToWriter
    );
  }
  f = message.getDenom();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getAdministrator();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
};


/**
 * optional EventMarkerAccess access = 1;
 * @return {?proto.provenance.marker.v1.EventMarkerAccess}
 */
proto.provenance.marker.v1.EventMarkerAddAccess.prototype.getAccess = function() {
  return /** @type{?proto.provenance.marker.v1.EventMarkerAccess} */ (
    jspb.Message.getWrapperField(this, proto.provenance.marker.v1.EventMarkerAccess, 1));
};


/**
 * @param {?proto.provenance.marker.v1.EventMarkerAccess|undefined} value
 * @return {!proto.provenance.marker.v1.EventMarkerAddAccess} returns this
*/
proto.provenance.marker.v1.EventMarkerAddAccess.prototype.setAccess = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.marker.v1.EventMarkerAddAccess} returns this
 */
proto.provenance.marker.v1.EventMarkerAddAccess.prototype.clearAccess = function() {
  return this.setAccess(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.marker.v1.EventMarkerAddAccess.prototype.hasAccess = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional string denom = 2;
 * @return {string}
 */
proto.provenance.marker.v1.EventMarkerAddAccess.prototype.getDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.marker.v1.EventMarkerAddAccess} returns this
 */
proto.provenance.marker.v1.EventMarkerAddAccess.prototype.setDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string administrator = 3;
 * @return {string}
 */
proto.provenance.marker.v1.EventMarkerAddAccess.prototype.getAdministrator = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.marker.v1.EventMarkerAddAccess} returns this
 */
proto.provenance.marker.v1.EventMarkerAddAccess.prototype.setAdministrator = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};

