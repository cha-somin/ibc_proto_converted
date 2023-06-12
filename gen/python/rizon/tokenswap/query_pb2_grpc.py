# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from rizon.tokenswap import query_pb2 as rizon_dot_tokenswap_dot_query__pb2


class QueryStub(object):
    """Query defines the gRPC querier service
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Tokenswap = channel.unary_unary(
                '/rizonworld.rizon.tokenswap.Query/Tokenswap',
                request_serializer=rizon_dot_tokenswap_dot_query__pb2.QueryTokenswapRequest.SerializeToString,
                response_deserializer=rizon_dot_tokenswap_dot_query__pb2.QueryTokenswapResponse.FromString,
                )
        self.SwappedAmount = channel.unary_unary(
                '/rizonworld.rizon.tokenswap.Query/SwappedAmount',
                request_serializer=rizon_dot_tokenswap_dot_query__pb2.QuerySwappedAmountRequest.SerializeToString,
                response_deserializer=rizon_dot_tokenswap_dot_query__pb2.QuerySwappedAmountResponse.FromString,
                )
        self.Params = channel.unary_unary(
                '/rizonworld.rizon.tokenswap.Query/Params',
                request_serializer=rizon_dot_tokenswap_dot_query__pb2.QueryParamsRequest.SerializeToString,
                response_deserializer=rizon_dot_tokenswap_dot_query__pb2.QueryParamsResponse.FromString,
                )


class QueryServicer(object):
    """Query defines the gRPC querier service
    """

    def Tokenswap(self, request, context):
        """Tokenswap queries tokenswap item for given tx hash
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def SwappedAmount(self, request, context):
        """SwappedAmount queries current swapped amount of tokenswap
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Params(self, request, context):
        """Params queries parameters of tokenswap
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Tokenswap': grpc.unary_unary_rpc_method_handler(
                    servicer.Tokenswap,
                    request_deserializer=rizon_dot_tokenswap_dot_query__pb2.QueryTokenswapRequest.FromString,
                    response_serializer=rizon_dot_tokenswap_dot_query__pb2.QueryTokenswapResponse.SerializeToString,
            ),
            'SwappedAmount': grpc.unary_unary_rpc_method_handler(
                    servicer.SwappedAmount,
                    request_deserializer=rizon_dot_tokenswap_dot_query__pb2.QuerySwappedAmountRequest.FromString,
                    response_serializer=rizon_dot_tokenswap_dot_query__pb2.QuerySwappedAmountResponse.SerializeToString,
            ),
            'Params': grpc.unary_unary_rpc_method_handler(
                    servicer.Params,
                    request_deserializer=rizon_dot_tokenswap_dot_query__pb2.QueryParamsRequest.FromString,
                    response_serializer=rizon_dot_tokenswap_dot_query__pb2.QueryParamsResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'rizonworld.rizon.tokenswap.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Query defines the gRPC querier service
    """

    @staticmethod
    def Tokenswap(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/rizonworld.rizon.tokenswap.Query/Tokenswap',
            rizon_dot_tokenswap_dot_query__pb2.QueryTokenswapRequest.SerializeToString,
            rizon_dot_tokenswap_dot_query__pb2.QueryTokenswapResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def SwappedAmount(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/rizonworld.rizon.tokenswap.Query/SwappedAmount',
            rizon_dot_tokenswap_dot_query__pb2.QuerySwappedAmountRequest.SerializeToString,
            rizon_dot_tokenswap_dot_query__pb2.QuerySwappedAmountResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

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
        return grpc.experimental.unary_unary(request, target, '/rizonworld.rizon.tokenswap.Query/Params',
            rizon_dot_tokenswap_dot_query__pb2.QueryParamsRequest.SerializeToString,
            rizon_dot_tokenswap_dot_query__pb2.QueryParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
