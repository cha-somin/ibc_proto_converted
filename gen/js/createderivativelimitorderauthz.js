// source: injective/exchange/v1beta1/authz.proto
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

goog.provide('proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz');

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
proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz.repeatedFields_, null);
};
goog.inherits(proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz.displayName = 'proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz.repeatedFields_ = [2];



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
proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz.toObject = function(includeInstance, msg) {
  var f, obj = {
    subaccountId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    marketIdsList: (f = jspb.Message.getRepeatedField(msg, 2)) == null ? undefined : f
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
 * @return {!proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz}
 */
proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz;
  return proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz}
 */
proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setSubaccountId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.addMarketIds(value);
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
proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSubaccountId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getMarketIdsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      2,
      f
    );
  }
};


/**
 * optional string subaccount_id = 1;
 * @return {string}
 */
proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz.prototype.getSubaccountId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz} returns this
 */
proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz.prototype.setSubaccountId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated string market_ids = 2;
 * @return {!Array<string>}
 */
proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz.prototype.getMarketIdsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 2));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz} returns this
 */
proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz.prototype.setMarketIdsList = function(value) {
  return jspb.Message.setField(this, 2, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz} returns this
 */
proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz.prototype.addMarketIds = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 2, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz} returns this
 */
proto.injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz.prototype.clearMarketIdsList = function() {
  return this.setMarketIdsList([]);
};


