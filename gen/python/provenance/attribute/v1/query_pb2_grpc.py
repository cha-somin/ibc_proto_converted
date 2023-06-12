# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from provenance.attribute.v1 import query_pb2 as provenance_dot_attribute_dot_v1_dot_query__pb2


class QueryStub(object):
    """Query defines the gRPC querier service for attribute module.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Params = channel.unary_unary(
                '/provenance.attribute.v1.Query/Params',
                request_serializer=provenance_dot_attribute_dot_v1_dot_query__pb2.QueryParamsRequest.SerializeToString,
                response_deserializer=provenance_dot_attribute_dot_v1_dot_query__pb2.QueryParamsResponse.FromString,
                )
        self.Attribute = channel.unary_unary(
                '/provenance.attribute.v1.Query/Attribute',
                request_serializer=provenance_dot_attribute_dot_v1_dot_query__pb2.QueryAttributeRequest.SerializeToString,
                response_deserializer=provenance_dot_attribute_dot_v1_dot_query__pb2.QueryAttributeResponse.FromString,
                )
        self.Attributes = channel.unary_unary(
                '/provenance.attribute.v1.Query/Attributes',
                request_serializer=provenance_dot_attribute_dot_v1_dot_query__pb2.QueryAttributesRequest.SerializeToString,
                response_deserializer=provenance_dot_attribute_dot_v1_dot_query__pb2.QueryAttributesResponse.FromString,
                )
        self.Scan = channel.unary_unary(
                '/provenance.attribute.v1.Query/Scan',
                request_serializer=provenance_dot_attribute_dot_v1_dot_query__pb2.QueryScanRequest.SerializeToString,
                response_deserializer=provenance_dot_attribute_dot_v1_dot_query__pb2.QueryScanResponse.FromString,
                )
        self.AttributeAccounts = channel.unary_unary(
                '/provenance.attribute.v1.Query/AttributeAccounts',
                request_serializer=provenance_dot_attribute_dot_v1_dot_query__pb2.QueryAttributeAccountsRequest.SerializeToString,
                response_deserializer=provenance_dot_attribute_dot_v1_dot_query__pb2.QueryAttributeAccountsResponse.FromString,
                )
        self.AccountData = channel.unary_unary(
                '/provenance.attribute.v1.Query/AccountData',
                request_serializer=provenance_dot_attribute_dot_v1_dot_query__pb2.QueryAccountDataRequest.SerializeToString,
                response_deserializer=provenance_dot_attribute_dot_v1_dot_query__pb2.QueryAccountDataResponse.FromString,
                )


class QueryServicer(object):
    """Query defines the gRPC querier service for attribute module.
    """

    def Params(self, request, context):
        """Params queries params of the attribute module.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Attribute(self, request, context):
        """Attribute queries attributes on a given account (address) for one (or more) with the given name
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Attributes(self, request, context):
        """Attributes queries attributes on a given account (address) for any defined attributes
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Scan(self, request, context):
        """Scan queries attributes on a given account (address) for any that match the provided suffix
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AttributeAccounts(self, request, context):
        """AttributeAccounts queries accounts on a given attribute name
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AccountData(self, request, context):
        """AccountData returns the accountdata for a specified account.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Params': grpc.unary_unary_rpc_method_handler(
                    servicer.Params,
                    request_deserializer=provenance_dot_attribute_dot_v1_dot_query__pb2.QueryParamsRequest.FromString,
                    response_serializer=provenance_dot_attribute_dot_v1_dot_query__pb2.QueryParamsResponse.SerializeToString,
            ),
            'Attribute': grpc.unary_unary_rpc_method_handler(
                    servicer.Attribute,
                    request_deserializer=provenance_dot_attribute_dot_v1_dot_query__pb2.QueryAttributeRequest.FromString,
                    response_serializer=provenance_dot_attribute_dot_v1_dot_query__pb2.QueryAttributeResponse.SerializeToString,
            ),
            'Attributes': grpc.unary_unary_rpc_method_handler(
                    servicer.Attributes,
                    request_deserializer=provenance_dot_attribute_dot_v1_dot_query__pb2.QueryAttributesRequest.FromString,
                    response_serializer=provenance_dot_attribute_dot_v1_dot_query__pb2.QueryAttributesResponse.SerializeToString,
            ),
            'Scan': grpc.unary_unary_rpc_method_handler(
                    servicer.Scan,
                    request_deserializer=provenance_dot_attribute_dot_v1_dot_query__pb2.QueryScanRequest.FromString,
                    response_serializer=provenance_dot_attribute_dot_v1_dot_query__pb2.QueryScanResponse.SerializeToString,
            ),
            'AttributeAccounts': grpc.unary_unary_rpc_method_handler(
                    servicer.AttributeAccounts,
                    request_deserializer=provenance_dot_attribute_dot_v1_dot_query__pb2.QueryAttributeAccountsRequest.FromString,
                    response_serializer=provenance_dot_attribute_dot_v1_dot_query__pb2.QueryAttributeAccountsResponse.SerializeToString,
            ),
            'AccountData': grpc.unary_unary_rpc_method_handler(
                    servicer.AccountData,
                    request_deserializer=provenance_dot_attribute_dot_v1_dot_query__pb2.QueryAccountDataRequest.FromString,
                    response_serializer=provenance_dot_attribute_dot_v1_dot_query__pb2.QueryAccountDataResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'provenance.attribute.v1.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Query defines the gRPC querier service for attribute module.
    """

    @staticmethod
    def Params(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/provenance.attribute.v1.Query/Params',
            provenance_dot_attribute_dot_v1_dot_query__pb2.QueryParamsRequest.SerializeToString,
            provenance_dot_attribute_dot_v1_dot_query__pb2.QueryParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Attribute(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/provenance.attribute.v1.Query/Attribute',
            provenance_dot_attribute_dot_v1_dot_query__pb2.QueryAttributeRequest.SerializeToString,
            provenance_dot_attribute_dot_v1_dot_query__pb2.QueryAttributeResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Attributes(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/provenance.attribute.v1.Query/Attributes',
            provenance_dot_attribute_dot_v1_dot_query__pb2.QueryAttributesRequest.SerializeToString,
            provenance_dot_attribute_dot_v1_dot_query__pb2.QueryAttributesResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Scan(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/provenance.attribute.v1.Query/Scan',
            provenance_dot_attribute_dot_v1_dot_query__pb2.QueryScanRequest.SerializeToString,
            provenance_dot_attribute_dot_v1_dot_query__pb2.QueryScanResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AttributeAccounts(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/provenance.attribute.v1.Query/AttributeAccounts',
            provenance_dot_attribute_dot_v1_dot_query__pb2.QueryAttributeAccountsRequest.SerializeToString,
            provenance_dot_attribute_dot_v1_dot_query__pb2.QueryAttributeAccountsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AccountData(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/provenance.attribute.v1.Query/AccountData',
            provenance_dot_attribute_dot_v1_dot_query__pb2.QueryAccountDataRequest.SerializeToString,
            provenance_dot_attribute_dot_v1_dot_query__pb2.QueryAccountDataResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
