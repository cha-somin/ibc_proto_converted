// source: crescent/farming/v1beta1/farming.proto
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

goog.provide('proto.crescent.farming.v1beta1.RatioPlan');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.crescent.farming.v1beta1.BasePlan');

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
proto.crescent.farming.v1beta1.RatioPlan = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.crescent.farming.v1beta1.RatioPlan, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.crescent.farming.v1beta1.RatioPlan.displayName = 'proto.crescent.farming.v1beta1.RatioPlan';
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
proto.crescent.farming.v1beta1.RatioPlan.prototype.toObject = function(opt_includeInstance) {
  return proto.crescent.farming.v1beta1.RatioPlan.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.crescent.farming.v1beta1.RatioPlan} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.farming.v1beta1.RatioPlan.toObject = function(includeInstance, msg) {
  var f, obj = {
    basePlan: (f = msg.getBasePlan()) && proto.crescent.farming.v1beta1.BasePlan.toObject(includeInstance, f),
    epochRatio: jspb.Message.getFieldWithDefault(msg, 2, "")
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
 * @return {!proto.crescent.farming.v1beta1.RatioPlan}
 */
proto.crescent.farming.v1beta1.RatioPlan.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.crescent.farming.v1beta1.RatioPlan;
  return proto.crescent.farming.v1beta1.RatioPlan.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.crescent.farming.v1beta1.RatioPlan} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.crescent.farming.v1beta1.RatioPlan}
 */
proto.crescent.farming.v1beta1.RatioPlan.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.crescent.farming.v1beta1.BasePlan;
      reader.readMessage(value,proto.crescent.farming.v1beta1.BasePlan.deserializeBinaryFromReader);
      msg.setBasePlan(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setEpochRatio(value);
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
proto.crescent.farming.v1beta1.RatioPlan.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.crescent.farming.v1beta1.RatioPlan.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.crescent.farming.v1beta1.RatioPlan} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.farming.v1beta1.RatioPlan.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBasePlan();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.crescent.farming.v1beta1.BasePlan.serializeBinaryToWriter
    );
  }
  f = message.getEpochRatio();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
};


/**
 * optional BasePlan base_plan = 1;
 * @return {?proto.crescent.farming.v1beta1.BasePlan}
 */
proto.crescent.farming.v1beta1.RatioPlan.prototype.getBasePlan = function() {
  return /** @type{?proto.crescent.farming.v1beta1.BasePlan} */ (
    jspb.Message.getWrapperField(this, proto.crescent.farming.v1beta1.BasePlan, 1));
};


/**
 * @param {?proto.crescent.farming.v1beta1.BasePlan|undefined} value
 * @return {!proto.crescent.farming.v1beta1.RatioPlan} returns this
*/
proto.crescent.farming.v1beta1.RatioPlan.prototype.setBasePlan = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.crescent.farming.v1beta1.RatioPlan} returns this
 */
proto.crescent.farming.v1beta1.RatioPlan.prototype.clearBasePlan = function() {
  return this.setBasePlan(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.crescent.farming.v1beta1.RatioPlan.prototype.hasBasePlan = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional string epoch_ratio = 2;
 * @return {string}
 */
proto.crescent.farming.v1beta1.RatioPlan.prototype.getEpochRatio = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.crescent.farming.v1beta1.RatioPlan} returns this
 */
proto.crescent.farming.v1beta1.RatioPlan.prototype.setEpochRatio = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};

