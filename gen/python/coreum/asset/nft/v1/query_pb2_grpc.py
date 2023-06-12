# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from coreum.asset.nft.v1 import query_pb2 as coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2


class QueryStub(object):
    """Query defines the gRPC querier service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Params = channel.unary_unary(
                '/coreum.asset.nft.v1.Query/Params',
                request_serializer=coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryParamsRequest.SerializeToString,
                response_deserializer=coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryParamsResponse.FromString,
                )
        self.Class = channel.unary_unary(
                '/coreum.asset.nft.v1.Query/Class',
                request_serializer=coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryClassRequest.SerializeToString,
                response_deserializer=coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryClassResponse.FromString,
                )
        self.Classes = channel.unary_unary(
                '/coreum.asset.nft.v1.Query/Classes',
                request_serializer=coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryClassesRequest.SerializeToString,
                response_deserializer=coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryClassesResponse.FromString,
                )
        self.Frozen = channel.unary_unary(
                '/coreum.asset.nft.v1.Query/Frozen',
                request_serializer=coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryFrozenRequest.SerializeToString,
                response_deserializer=coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryFrozenResponse.FromString,
                )
        self.Whitelisted = channel.unary_unary(
                '/coreum.asset.nft.v1.Query/Whitelisted',
                request_serializer=coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryWhitelistedRequest.SerializeToString,
                response_deserializer=coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryWhitelistedResponse.FromString,
                )
        self.WhitelistedAccountsForNFT = channel.unary_unary(
                '/coreum.asset.nft.v1.Query/WhitelistedAccountsForNFT',
                request_serializer=coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryWhitelistedAccountsForNFTRequest.SerializeToString,
                response_deserializer=coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryWhitelistedAccountsForNFTResponse.FromString,
                )


class QueryServicer(object):
    """Query defines the gRPC querier service.
    """

    def Params(self, request, context):
        """Params queries the parameters of x/asset/ft module.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Class(self, request, context):
        """Class queries the non-fungible token class of the module.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Classes(self, request, context):
        """Classes queries the non-fungible token classes of the module.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Frozen(self, request, context):
        """Frozen queries to check if an NFT is frozen or not.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Whitelisted(self, request, context):
        """Whitelisted queries to check if an account is whitelited to hold an NFT or not.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def WhitelistedAccountsForNFT(self, request, context):
        """WhitelistedAccountsForNFT returns the list of accounts which are whitelisted to hold this NFT.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Params': grpc.unary_unary_rpc_method_handler(
                    servicer.Params,
                    request_deserializer=coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryParamsRequest.FromString,
                    response_serializer=coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryParamsResponse.SerializeToString,
            ),
            'Class': grpc.unary_unary_rpc_method_handler(
                    servicer.Class,
                    request_deserializer=coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryClassRequest.FromString,
                    response_serializer=coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryClassResponse.SerializeToString,
            ),
            'Classes': grpc.unary_unary_rpc_method_handler(
                    servicer.Classes,
                    request_deserializer=coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryClassesRequest.FromString,
                    response_serializer=coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryClassesResponse.SerializeToString,
            ),
            'Frozen': grpc.unary_unary_rpc_method_handler(
                    servicer.Frozen,
                    request_deserializer=coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryFrozenRequest.FromString,
                    response_serializer=coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryFrozenResponse.SerializeToString,
            ),
            'Whitelisted': grpc.unary_unary_rpc_method_handler(
                    servicer.Whitelisted,
                    request_deserializer=coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryWhitelistedRequest.FromString,
                    response_serializer=coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryWhitelistedResponse.SerializeToString,
            ),
            'WhitelistedAccountsForNFT': grpc.unary_unary_rpc_method_handler(
                    servicer.WhitelistedAccountsForNFT,
                    request_deserializer=coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryWhitelistedAccountsForNFTRequest.FromString,
                    response_serializer=coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryWhitelistedAccountsForNFTResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'coreum.asset.nft.v1.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Query defines the gRPC querier service.
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
        return grpc.experimental.unary_unary(request, target, '/coreum.asset.nft.v1.Query/Params',
            coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryParamsRequest.SerializeToString,
            coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Class(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/coreum.asset.nft.v1.Query/Class',
            coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryClassRequest.SerializeToString,
            coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryClassResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Classes(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/coreum.asset.nft.v1.Query/Classes',
            coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryClassesRequest.SerializeToString,
            coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryClassesResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Frozen(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/coreum.asset.nft.v1.Query/Frozen',
            coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryFrozenRequest.SerializeToString,
            coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryFrozenResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Whitelisted(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/coreum.asset.nft.v1.Query/Whitelisted',
            coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryWhitelistedRequest.SerializeToString,
            coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryWhitelistedResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def WhitelistedAccountsForNFT(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/coreum.asset.nft.v1.Query/WhitelistedAccountsForNFT',
            coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryWhitelistedAccountsForNFTRequest.SerializeToString,
            coreum_dot_asset_dot_nft_dot_v1_dot_query__pb2.QueryWhitelistedAccountsForNFTResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
