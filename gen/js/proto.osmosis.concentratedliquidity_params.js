// source: osmosis/concentrated-liquidity/params.proto
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

goog.provide('proto.osmosis.concentratedliquidity.Params');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Duration');

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
proto.osmosis.concentratedliquidity.Params = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.osmosis.concentratedliquidity.Params.repeatedFields_, null);
};
goog.inherits(proto.osmosis.concentratedliquidity.Params, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.concentratedliquidity.Params.displayName = 'proto.osmosis.concentratedliquidity.Params';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.osmosis.concentratedliquidity.Params.repeatedFields_ = [1,2,4,5];



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
proto.osmosis.concentratedliquidity.Params.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.concentratedliquidity.Params.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.concentratedliquidity.Params} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.concentratedliquidity.Params.toObject = function(includeInstance, msg) {
  var f, obj = {
    authorizedTickSpacingList: (f = jspb.Message.getRepeatedField(msg, 1)) == null ? undefined : f,
    authorizedSpreadFactorsList: (f = jspb.Message.getRepeatedField(msg, 2)) == null ? undefined : f,
    balancerSharesRewardDiscount: jspb.Message.getFieldWithDefault(msg, 3, ""),
    authorizedQuoteDenomsList: (f = jspb.Message.getRepeatedField(msg, 4)) == null ? undefined : f,
    authorizedUptimesList: jspb.Message.toObjectList(msg.getAuthorizedUptimesList(),
    proto.google.protobuf.Duration.toObject, includeInstance),
    isPermissionlessPoolCreationEnabled: jspb.Message.getBooleanFieldWithDefault(msg, 6, false)
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
 * @return {!proto.osmosis.concentratedliquidity.Params}
 */
proto.osmosis.concentratedliquidity.Params.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.concentratedliquidity.Params;
  return proto.osmosis.concentratedliquidity.Params.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.concentratedliquidity.Params} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.concentratedliquidity.Params}
 */
proto.osmosis.concentratedliquidity.Params.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var values = /** @type {!Array<number>} */ (reader.isDelimited() ? reader.readPackedUint64() : [reader.readUint64()]);
      for (var i = 0; i < values.length; i++) {
        msg.addAuthorizedTickSpacing(values[i]);
      }
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.addAuthorizedSpreadFactors(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setBalancerSharesRewardDiscount(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.addAuthorizedQuoteDenoms(value);
      break;
    case 5:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.addAuthorizedUptimes(value);
      break;
    case 6:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setIsPermissionlessPoolCreationEnabled(value);
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
proto.osmosis.concentratedliquidity.Params.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.concentratedliquidity.Params.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.concentratedliquidity.Params} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.concentratedliquidity.Params.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAuthorizedTickSpacingList();
  if (f.length > 0) {
    writer.writePackedUint64(
      1,
      f
    );
  }
  f = message.getAuthorizedSpreadFactorsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      2,
      f
    );
  }
  f = message.getBalancerSharesRewardDiscount();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getAuthorizedQuoteDenomsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      4,
      f
    );
  }
  f = message.getAuthorizedUptimesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      5,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
  f = message.getIsPermissionlessPoolCreationEnabled();
  if (f) {
    writer.writeBool(
      6,
      f
    );
  }
};


/**
 * repeated uint64 authorized_tick_spacing = 1;
 * @return {!Array<number>}
 */
proto.osmosis.concentratedliquidity.Params.prototype.getAuthorizedTickSpacingList = function() {
  return /** @type {!Array<number>} */ (jspb.Message.getRepeatedField(this, 1));
};


/**
 * @param {!Array<number>} value
 * @return {!proto.osmosis.concentratedliquidity.Params} returns this
 */
proto.osmosis.concentratedliquidity.Params.prototype.setAuthorizedTickSpacingList = function(value) {
  return jspb.Message.setField(this, 1, value || []);
};


/**
 * @param {number} value
 * @param {number=} opt_index
 * @return {!proto.osmosis.concentratedliquidity.Params} returns this
 */
proto.osmosis.concentratedliquidity.Params.prototype.addAuthorizedTickSpacing = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 1, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.osmosis.concentratedliquidity.Params} returns this
 */
proto.osmosis.concentratedliquidity.Params.prototype.clearAuthorizedTickSpacingList = function() {
  return this.setAuthorizedTickSpacingList([]);
};


/**
 * repeated string authorized_spread_factors = 2;
 * @return {!Array<string>}
 */
proto.osmosis.concentratedliquidity.Params.prototype.getAuthorizedSpreadFactorsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 2));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.osmosis.concentratedliquidity.Params} returns this
 */
proto.osmosis.concentratedliquidity.Params.prototype.setAuthorizedSpreadFactorsList = function(value) {
  return jspb.Message.setField(this, 2, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.osmosis.concentratedliquidity.Params} returns this
 */
proto.osmosis.concentratedliquidity.Params.prototype.addAuthorizedSpreadFactors = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 2, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.osmosis.concentratedliquidity.Params} returns this
 */
proto.osmosis.concentratedliquidity.Params.prototype.clearAuthorizedSpreadFactorsList = function() {
  return this.setAuthorizedSpreadFactorsList([]);
};


/**
 * optional string balancer_shares_reward_discount = 3;
 * @return {string}
 */
proto.osmosis.concentratedliquidity.Params.prototype.getBalancerSharesRewardDiscount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.concentratedliquidity.Params} returns this
 */
proto.osmosis.concentratedliquidity.Params.prototype.setBalancerSharesRewardDiscount = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * repeated string authorized_quote_denoms = 4;
 * @return {!Array<string>}
 */
proto.osmosis.concentratedliquidity.Params.prototype.getAuthorizedQuoteDenomsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 4));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.osmosis.concentratedliquidity.Params} returns this
 */
proto.osmosis.concentratedliquidity.Params.prototype.setAuthorizedQuoteDenomsList = function(value) {
  return jspb.Message.setField(this, 4, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.osmosis.concentratedliquidity.Params} returns this
 */
proto.osmosis.concentratedliquidity.Params.prototype.addAuthorizedQuoteDenoms = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 4, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.osmosis.concentratedliquidity.Params} returns this
 */
proto.osmosis.concentratedliquidity.Params.prototype.clearAuthorizedQuoteDenomsList = function() {
  return this.setAuthorizedQuoteDenomsList([]);
};


/**
 * repeated google.protobuf.Duration authorized_uptimes = 5;
 * @return {!Array<!proto.google.protobuf.Duration>}
 */
proto.osmosis.concentratedliquidity.Params.prototype.getAuthorizedUptimesList = function() {
  return /** @type{!Array<!proto.google.protobuf.Duration>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.google.protobuf.Duration, 5));
};


/**
 * @param {!Array<!proto.google.protobuf.Duration>} value
 * @return {!proto.osmosis.concentratedliquidity.Params} returns this
*/
proto.osmosis.concentratedliquidity.Params.prototype.setAuthorizedUptimesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 5, value);
};


/**
 * @param {!proto.google.protobuf.Duration=} opt_value
 * @param {number=} opt_index
 * @return {!proto.google.protobuf.Duration}
 */
proto.osmosis.concentratedliquidity.Params.prototype.addAuthorizedUptimes = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 5, opt_value, proto.google.protobuf.Duration, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.osmosis.concentratedliquidity.Params} returns this
 */
proto.osmosis.concentratedliquidity.Params.prototype.clearAuthorizedUptimesList = function() {
  return this.setAuthorizedUptimesList([]);
};


/**
 * optional bool is_permissionless_pool_creation_enabled = 6;
 * @return {boolean}
 */
proto.osmosis.concentratedliquidity.Params.prototype.getIsPermissionlessPoolCreationEnabled = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 6, false));
};


/**
 * @param {boolean} value
 * @return {!proto.osmosis.concentratedliquidity.Params} returns this
 */
proto.osmosis.concentratedliquidity.Params.prototype.setIsPermissionlessPoolCreationEnabled = function(value) {
  return jspb.Message.setProto3BooleanField(this, 6, value);
};


