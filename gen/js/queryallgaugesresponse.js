// source: comdex/rewards/v1beta1/query.proto
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

goog.provide('proto.comdex.rewards.v1beta1.QueryAllGaugesResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.comdex.rewards.v1beta1.Gauge');
goog.require('proto.cosmos.base.query.v1beta1.PageResponse');

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
proto.comdex.rewards.v1beta1.QueryAllGaugesResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.comdex.rewards.v1beta1.QueryAllGaugesResponse.repeatedFields_, null);
};
goog.inherits(proto.comdex.rewards.v1beta1.QueryAllGaugesResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.rewards.v1beta1.QueryAllGaugesResponse.displayName = 'proto.comdex.rewards.v1beta1.QueryAllGaugesResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.comdex.rewards.v1beta1.QueryAllGaugesResponse.repeatedFields_ = [1];



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
proto.comdex.rewards.v1beta1.QueryAllGaugesResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.rewards.v1beta1.QueryAllGaugesResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.rewards.v1beta1.QueryAllGaugesResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.rewards.v1beta1.QueryAllGaugesResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    gaugesList: jspb.Message.toObjectList(msg.getGaugesList(),
    proto.comdex.rewards.v1beta1.Gauge.toObject, includeInstance),
    pagination: (f = msg.getPagination()) && proto.cosmos.base.query.v1beta1.PageResponse.toObject(includeInstance, f)
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
 * @return {!proto.comdex.rewards.v1beta1.QueryAllGaugesResponse}
 */
proto.comdex.rewards.v1beta1.QueryAllGaugesResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.rewards.v1beta1.QueryAllGaugesResponse;
  return proto.comdex.rewards.v1beta1.QueryAllGaugesResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.rewards.v1beta1.QueryAllGaugesResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.rewards.v1beta1.QueryAllGaugesResponse}
 */
proto.comdex.rewards.v1beta1.QueryAllGaugesResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.comdex.rewards.v1beta1.Gauge;
      reader.readMessage(value,proto.comdex.rewards.v1beta1.Gauge.deserializeBinaryFromReader);
      msg.addGauges(value);
      break;
    case 2:
      var value = new proto.cosmos.base.query.v1beta1.PageResponse;
      reader.readMessage(value,proto.cosmos.base.query.v1beta1.PageResponse.deserializeBinaryFromReader);
      msg.setPagination(value);
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
proto.comdex.rewards.v1beta1.QueryAllGaugesResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.rewards.v1beta1.QueryAllGaugesResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.rewards.v1beta1.QueryAllGaugesResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.rewards.v1beta1.QueryAllGaugesResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getGaugesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.comdex.rewards.v1beta1.Gauge.serializeBinaryToWriter
    );
  }
  f = message.getPagination();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.base.query.v1beta1.PageResponse.serializeBinaryToWriter
    );
  }
};


/**
 * repeated Gauge gauges = 1;
 * @return {!Array<!proto.comdex.rewards.v1beta1.Gauge>}
 */
proto.comdex.rewards.v1beta1.QueryAllGaugesResponse.prototype.getGaugesList = function() {
  return /** @type{!Array<!proto.comdex.rewards.v1beta1.Gauge>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.comdex.rewards.v1beta1.Gauge, 1));
};


/**
 * @param {!Array<!proto.comdex.rewards.v1beta1.Gauge>} value
 * @return {!proto.comdex.rewards.v1beta1.QueryAllGaugesResponse} returns this
*/
proto.comdex.rewards.v1beta1.QueryAllGaugesResponse.prototype.setGaugesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.comdex.rewards.v1beta1.Gauge=} opt_value
 * @param {number=} opt_index
 * @return {!proto.comdex.rewards.v1beta1.Gauge}
 */
proto.comdex.rewards.v1beta1.QueryAllGaugesResponse.prototype.addGauges = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.comdex.rewards.v1beta1.Gauge, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.comdex.rewards.v1beta1.QueryAllGaugesResponse} returns this
 */
proto.comdex.rewards.v1beta1.QueryAllGaugesResponse.prototype.clearGaugesList = function() {
  return this.setGaugesList([]);
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse pagination = 2;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.comdex.rewards.v1beta1.QueryAllGaugesResponse.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 2));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.comdex.rewards.v1beta1.QueryAllGaugesResponse} returns this
*/
proto.comdex.rewards.v1beta1.QueryAllGaugesResponse.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.rewards.v1beta1.QueryAllGaugesResponse} returns this
 */
proto.comdex.rewards.v1beta1.QueryAllGaugesResponse.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.rewards.v1beta1.QueryAllGaugesResponse.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 2) != null;
};


