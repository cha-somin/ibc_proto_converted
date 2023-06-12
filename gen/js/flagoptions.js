// source: cosmos/autocli/v1/options.proto
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

goog.provide('proto.cosmos.autocli.v1.FlagOptions');

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
proto.cosmos.autocli.v1.FlagOptions = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cosmos.autocli.v1.FlagOptions, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.autocli.v1.FlagOptions.displayName = 'proto.cosmos.autocli.v1.FlagOptions';
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
proto.cosmos.autocli.v1.FlagOptions.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.autocli.v1.FlagOptions.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.autocli.v1.FlagOptions} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.autocli.v1.FlagOptions.toObject = function(includeInstance, msg) {
  var f, obj = {
    name: jspb.Message.getFieldWithDefault(msg, 1, ""),
    shorthand: jspb.Message.getFieldWithDefault(msg, 2, ""),
    usage: jspb.Message.getFieldWithDefault(msg, 3, ""),
    defaultValue: jspb.Message.getFieldWithDefault(msg, 4, ""),
    deprecated: jspb.Message.getFieldWithDefault(msg, 6, ""),
    shorthandDeprecated: jspb.Message.getFieldWithDefault(msg, 7, ""),
    hidden: jspb.Message.getBooleanFieldWithDefault(msg, 8, false)
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
 * @return {!proto.cosmos.autocli.v1.FlagOptions}
 */
proto.cosmos.autocli.v1.FlagOptions.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.autocli.v1.FlagOptions;
  return proto.cosmos.autocli.v1.FlagOptions.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.autocli.v1.FlagOptions} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.autocli.v1.FlagOptions}
 */
proto.cosmos.autocli.v1.FlagOptions.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setName(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setShorthand(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setUsage(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setDefaultValue(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setDeprecated(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setShorthandDeprecated(value);
      break;
    case 8:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setHidden(value);
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
proto.cosmos.autocli.v1.FlagOptions.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.autocli.v1.FlagOptions.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.autocli.v1.FlagOptions} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.autocli.v1.FlagOptions.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getName();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getShorthand();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getUsage();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getDefaultValue();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getDeprecated();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getShorthandDeprecated();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
  f = message.getHidden();
  if (f) {
    writer.writeBool(
      8,
      f
    );
  }
};


/**
 * optional string name = 1;
 * @return {string}
 */
proto.cosmos.autocli.v1.FlagOptions.prototype.getName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.autocli.v1.FlagOptions} returns this
 */
proto.cosmos.autocli.v1.FlagOptions.prototype.setName = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string shorthand = 2;
 * @return {string}
 */
proto.cosmos.autocli.v1.FlagOptions.prototype.getShorthand = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.autocli.v1.FlagOptions} returns this
 */
proto.cosmos.autocli.v1.FlagOptions.prototype.setShorthand = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string usage = 3;
 * @return {string}
 */
proto.cosmos.autocli.v1.FlagOptions.prototype.getUsage = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.autocli.v1.FlagOptions} returns this
 */
proto.cosmos.autocli.v1.FlagOptions.prototype.setUsage = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string default_value = 4;
 * @return {string}
 */
proto.cosmos.autocli.v1.FlagOptions.prototype.getDefaultValue = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.autocli.v1.FlagOptions} returns this
 */
proto.cosmos.autocli.v1.FlagOptions.prototype.setDefaultValue = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string deprecated = 6;
 * @return {string}
 */
proto.cosmos.autocli.v1.FlagOptions.prototype.getDeprecated = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.autocli.v1.FlagOptions} returns this
 */
proto.cosmos.autocli.v1.FlagOptions.prototype.setDeprecated = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional string shorthand_deprecated = 7;
 * @return {string}
 */
proto.cosmos.autocli.v1.FlagOptions.prototype.getShorthandDeprecated = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.autocli.v1.FlagOptions} returns this
 */
proto.cosmos.autocli.v1.FlagOptions.prototype.setShorthandDeprecated = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


/**
 * optional bool hidden = 8;
 * @return {boolean}
 */
proto.cosmos.autocli.v1.FlagOptions.prototype.getHidden = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 8, false));
};


/**
 * @param {boolean} value
 * @return {!proto.cosmos.autocli.v1.FlagOptions} returns this
 */
proto.cosmos.autocli.v1.FlagOptions.prototype.setHidden = function(value) {
  return jspb.Message.setProto3BooleanField(this, 8, value);
};


