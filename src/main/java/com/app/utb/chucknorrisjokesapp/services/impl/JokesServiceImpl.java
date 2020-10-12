package com.app.utb.chucknorrisjokesapp.services.impl;

import com.app.utb.chucknorrisjokesapp.services.JokesService;
import guru.springframework.norris.chuck.ChuckNorrisInfoContributor;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {


    @Override
    public String generatetJokes() {

        ChuckNorrisInfoContributor chuckNorrisInfoContributor  = new ChuckNorrisInfoContributor();
        ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
        String randomQuote = chuckNorrisQuotes.getRandomQuote();
        return randomQuote;
    }
}
