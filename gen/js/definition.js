// source: coreum/asset/ft/v1/token.proto
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

goog.provide('proto.coreum.asset.ft.v1.Definition');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

goog.forwardDeclare('proto.coreum.asset.ft.v1.Feature');
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
proto.coreum.asset.ft.v1.Definition = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.coreum.asset.ft.v1.Definition.repeatedFields_, null);
};
goog.inherits(proto.coreum.asset.ft.v1.Definition, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.coreum.asset.ft.v1.Definition.displayName = 'proto.coreum.asset.ft.v1.Definition';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.coreum.asset.ft.v1.Definition.repeatedFields_ = [3];



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
proto.coreum.asset.ft.v1.Definition.prototype.toObject = function(opt_includeInstance) {
  return proto.coreum.asset.ft.v1.Definition.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.coreum.asset.ft.v1.Definition} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.coreum.asset.ft.v1.Definition.toObject = function(includeInstance, msg) {
  var f, obj = {
    denom: jspb.Message.getFieldWithDefault(msg, 1, ""),
    issuer: jspb.Message.getFieldWithDefault(msg, 2, ""),
    featuresList: (f = jspb.Message.getRepeatedField(msg, 3)) == null ? undefined : f,
    burnRate: jspb.Message.getFieldWithDefault(msg, 4, ""),
    sendCommissionRate: jspb.Message.getFieldWithDefault(msg, 5, "")
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
 * @return {!proto.coreum.asset.ft.v1.Definition}
 */
proto.coreum.asset.ft.v1.Definition.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.coreum.asset.ft.v1.Definition;
  return proto.coreum.asset.ft.v1.Definition.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.coreum.asset.ft.v1.Definition} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.coreum.asset.ft.v1.Definition}
 */
proto.coreum.asset.ft.v1.Definition.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setDenom(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setIssuer(value);
      break;
    case 3:
      var values = /** @type {!Array<!proto.coreum.asset.ft.v1.Feature>} */ (reader.isDelimited() ? reader.readPackedEnum() : [reader.readEnum()]);
      for (var i = 0; i < values.length; i++) {
        msg.addFeatures(values[i]);
      }
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setBurnRate(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setSendCommissionRate(value);
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
proto.coreum.asset.ft.v1.Definition.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.coreum.asset.ft.v1.Definition.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.coreum.asset.ft.v1.Definition} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.coreum.asset.ft.v1.Definition.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDenom();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getIssuer();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getFeaturesList();
  if (f.length > 0) {
    writer.writePackedEnum(
      3,
      f
    );
  }
  f = message.getBurnRate();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getSendCommissionRate();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
};


/**
 * optional string denom = 1;
 * @return {string}
 */
proto.coreum.asset.ft.v1.Definition.prototype.getDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.coreum.asset.ft.v1.Definition} returns this
 */
proto.coreum.asset.ft.v1.Definition.prototype.setDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string issuer = 2;
 * @return {string}
 */
proto.coreum.asset.ft.v1.Definition.prototype.getIssuer = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.coreum.asset.ft.v1.Definition} returns this
 */
proto.coreum.asset.ft.v1.Definition.prototype.setIssuer = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * repeated Feature features = 3;
 * @return {!Array<!proto.coreum.asset.ft.v1.Feature>}
 */
proto.coreum.asset.ft.v1.Definition.prototype.getFeaturesList = function() {
  return /** @type {!Array<!proto.coreum.asset.ft.v1.Feature>} */ (jspb.Message.getRepeatedField(this, 3));
};


/**
 * @param {!Array<!proto.coreum.asset.ft.v1.Feature>} value
 * @return {!proto.coreum.asset.ft.v1.Definition} returns this
 */
proto.coreum.asset.ft.v1.Definition.prototype.setFeaturesList = function(value) {
  return jspb.Message.setField(this, 3, value || []);
};


/**
 * @param {!proto.coreum.asset.ft.v1.Feature} value
 * @param {number=} opt_index
 * @return {!proto.coreum.asset.ft.v1.Definition} returns this
 */
proto.coreum.asset.ft.v1.Definition.prototype.addFeatures = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 3, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.coreum.asset.ft.v1.Definition} returns this
 */
proto.coreum.asset.ft.v1.Definition.prototype.clearFeaturesList = function() {
  return this.setFeaturesList([]);
};


/**
 * optional string burn_rate = 4;
 * @return {string}
 */
proto.coreum.asset.ft.v1.Definition.prototype.getBurnRate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.coreum.asset.ft.v1.Definition} returns this
 */
proto.coreum.asset.ft.v1.Definition.prototype.setBurnRate = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string send_commission_rate = 5;
 * @return {string}
 */
proto.coreum.asset.ft.v1.Definition.prototype.getSendCommissionRate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.coreum.asset.ft.v1.Definition} returns this
 */
proto.coreum.asset.ft.v1.Definition.prototype.setSendCommissionRate = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};

