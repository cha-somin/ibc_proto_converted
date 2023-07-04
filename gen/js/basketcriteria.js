// source: regen/ecocredit/v1alpha2/types.proto
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

goog.provide('proto.regen.ecocredit.v1alpha2.BasketCriteria');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.regen.ecocredit.v1alpha2.Filter');

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
proto.regen.ecocredit.v1alpha2.BasketCriteria = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.regen.ecocredit.v1alpha2.BasketCriteria, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.regen.ecocredit.v1alpha2.BasketCriteria.displayName = 'proto.regen.ecocredit.v1alpha2.BasketCriteria';
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
proto.regen.ecocredit.v1alpha2.BasketCriteria.prototype.toObject = function(opt_includeInstance) {
  return proto.regen.ecocredit.v1alpha2.BasketCriteria.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.regen.ecocredit.v1alpha2.BasketCriteria} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.regen.ecocredit.v1alpha2.BasketCriteria.toObject = function(includeInstance, msg) {
  var f, obj = {
    filter: (f = msg.getFilter()) && proto.regen.ecocredit.v1alpha2.Filter.toObject(includeInstance, f),
    multiplier: jspb.Message.getFieldWithDefault(msg, 2, "")
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
 * @return {!proto.regen.ecocredit.v1alpha2.BasketCriteria}
 */
proto.regen.ecocredit.v1alpha2.BasketCriteria.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.regen.ecocredit.v1alpha2.BasketCriteria;
  return proto.regen.ecocredit.v1alpha2.BasketCriteria.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.regen.ecocredit.v1alpha2.BasketCriteria} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.regen.ecocredit.v1alpha2.BasketCriteria}
 */
proto.regen.ecocredit.v1alpha2.BasketCriteria.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.regen.ecocredit.v1alpha2.Filter;
      reader.readMessage(value,proto.regen.ecocredit.v1alpha2.Filter.deserializeBinaryFromReader);
      msg.setFilter(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setMultiplier(value);
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
proto.regen.ecocredit.v1alpha2.BasketCriteria.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.regen.ecocredit.v1alpha2.BasketCriteria.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.regen.ecocredit.v1alpha2.BasketCriteria} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.regen.ecocredit.v1alpha2.BasketCriteria.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getFilter();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.regen.ecocredit.v1alpha2.Filter.serializeBinaryToWriter
    );
  }
  f = message.getMultiplier();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
};


/**
 * optional Filter filter = 1;
 * @return {?proto.regen.ecocredit.v1alpha2.Filter}
 */
proto.regen.ecocredit.v1alpha2.BasketCriteria.prototype.getFilter = function() {
  return /** @type{?proto.regen.ecocredit.v1alpha2.Filter} */ (
    jspb.Message.getWrapperField(this, proto.regen.ecocredit.v1alpha2.Filter, 1));
};


/**
 * @param {?proto.regen.ecocredit.v1alpha2.Filter|undefined} value
 * @return {!proto.regen.ecocredit.v1alpha2.BasketCriteria} returns this
*/
proto.regen.ecocredit.v1alpha2.BasketCriteria.prototype.setFilter = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.regen.ecocredit.v1alpha2.BasketCriteria} returns this
 */
proto.regen.ecocredit.v1alpha2.BasketCriteria.prototype.clearFilter = function() {
  return this.setFilter(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.regen.ecocredit.v1alpha2.BasketCriteria.prototype.hasFilter = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional string multiplier = 2;
 * @return {string}
 */
proto.regen.ecocredit.v1alpha2.BasketCriteria.prototype.getMultiplier = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.regen.ecocredit.v1alpha2.BasketCriteria} returns this
 */
proto.regen.ecocredit.v1alpha2.BasketCriteria.prototype.setMultiplier = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};

