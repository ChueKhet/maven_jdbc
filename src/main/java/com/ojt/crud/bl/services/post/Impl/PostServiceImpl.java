package com.ojt.crud.bl.services.post.Impl;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.ojt.crud.bl.services.post.PostService;
import com.ojt.crud.persistence.entity.Post;

public class PostServiceImpl implements PostService{
	static class UserMapper implements RowMapper<Post> {
        public Post mapRow(ResultSet rs, int rowNum) throws SQLException {
            Post post = new Post();
            post.setId(rs.getInt("id"));
            post.setCreated_At(rs.getTimestamp("created_at"));
            post.setDescription(rs.getString("description"));
            post.setTitle(rs.getString("title"));
            return post;
        }
	}
	
	@Autowired
	private JdbcTemplate jdbcTemp;
	
	@Override
	public List<Post> getAllPost() {
		String sql = "SELECT * FROM contact";
		List<Post> listPost = jdbcTemp.query(sql, new RowMapper<Post>() {

			@Override
			public Post mapRow(ResultSet rs, int rowNum) throws SQLException {
				Post p = new Post();
				p.setId(rs.getInt("id"));
				p.setTitle(rs.getString("title"));
				p.setDescription(rs.getString("description"));
				p.setCreated_At(rs.getTimestamp("created_At"));
				p.setUpdated_At(rs.getTimestamp("updated_At"));
				return p;
			}

		});

	return listPost;
	}
}